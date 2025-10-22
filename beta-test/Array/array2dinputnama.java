import java.util.Scanner;

public class array2dinputnama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] siswa = new String[2][3];

        for (int i = 0; i < siswa.length; i++) {
            for (int j = 0; j < siswa[i].length; j++) {
                System.out.print("Masukan nama siswa:");
                siswa [i][j] = sc.nextLine();
            
            }  
        }
        for (int i = 0; i < siswa.length; i++) {
            System.out.println("siswa kelas-"+(i+1));
            for (int j = 0; j < siswa[i].length; j++) {
                System.out.println("nama siswa:"+siswa[i][j]);
        
            }
            System.out.println();
        }
    }
}
