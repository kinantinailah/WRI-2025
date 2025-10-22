import java.util.Scanner;

public class ArrayTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] nama = new String[4];
        for (int i = 0; i < nama.length; i++) {
           System.out.println("Masukan nama teman");
            nama[i] = input.nextLine();
            
        }
        for (int i = 0; i < nama.length; i++) {
            System.out.println("Nama :");
            System.out.print(nama[i]);
            
            for (String n : nama) {
                System.out.println(p);

                
            }
            
        }
    }
}
