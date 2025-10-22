import java.util.Scanner;

public class nestedloop {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    System.out.print("Masukan baris:");
    int baris = sc.nextInt();

    System.out.print("Masukan kolom:");
    int kolom = sc.nextInt();

    for (int i = 0; i < baris; i++) {
        for (int j = 0; j < kolom; j++) {
            System.out.print("*");
            
        }
        System.out.println();
        
    }
}
}
    

