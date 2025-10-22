import java.util.Scanner;

public class segitiga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan kolom:");
        int kolom = sc.nextInt();
        for (int i = 0; i < kolom ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
    
}
