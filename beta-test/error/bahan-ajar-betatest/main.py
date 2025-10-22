import os
import sys
import base64
from google import genai
from InquirerPy import inquirer


def read_files_in_directory(directory_path):
    if not os.path.isdir(directory_path):
        print(f"{directory_path} is not valid directory")
        return

    all_content = ""
    for filename in os.listdir(directory_path):
        file_path = os.path.join(directory_path, filename)

        if os.path.isfile(file_path) and filename.endswith((".java", ".txt")):
            try:
                with open(file_path, "r", encoding="utf-8") as f:
                    file_content = f.read()
                    all_content += f"\nFilename: {filename}\n{file_content}"
            except Exception as e:
                print(f"Fail read {filename}\n{e}")

    return all_content


def get_gemini_correction(file_content):
    api_key = "Masukkan api key gemini kalian disini"
    client = genai.Client(api_key=api_key)

    response = client.models.generate_content(
        model="gemini-2.5-flash",
        contents=f"""
        kamu akan berperan sebagai korektor yang judes(menjawab dengan singkat) tapi tetap kritis.  
        diberikan sebuah kodingan yang salah dalam file, pada mulanya {file_content} berisi sebuah kodingan yang salah.
        lalu aku memberikan mereka tugas untuk membenarkan isi dari {file_content} sesuai dengan file todo.txt yang ada didalamnya.
        periksa apakah {file_content} sudah memenuhi tugas untuk menyelesaikan tugas yang ada. 
        jika terdapat salah maka jelaskan saja kalau dia masih salah tanpa memberi tahu letak salahnya serta berikan sedikit sarkas kalau bisa.
        toleransi kebenaran output jika yang berbeda hanyalah misalkan diantara angka terdapat spasi, koma, ataupun newline(misal output yang diharapkan adalah 1,2,3,4,5,6,7 maka hasil 1234567 adalah benar. begitu juga dengan 
        1
        2
        3
        4
        5
        6
        7
        juga benar)
        """,
    )

    print(response.text)


if __name__ == "__main__":
    # detect base dir
    if getattr(sys, "frozen", False):
        base_dir = os.path.dirname(sys.executable)
    else:
        base_dir = os.path.dirname(os.path.abspath(__file__))

    # list folders
    folders = [
        f for f in os.listdir(base_dir) if os.path.isdir(os.path.join(base_dir, f))
    ]

    if not folders:
        print("There is no any folder in this directory")
        sys.exit(1)

    # interactive selection with arrow keys
    choice = inquirer.select(
        message="Choose folder to check:",
        choices=folders,
        default=folders[0],
    ).execute()

    target_dir = os.path.join(base_dir, choice)
    content = read_files_in_directory(target_dir)

    if content:
        get_gemini_correction(content)

    input("\nPress enter to exit...")
