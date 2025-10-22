import java.util.Scanner;

public class Bioskop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan USIA :");
        int usia = input.nextInt();

        if (usia < 17) {
            System.out.println("Harga 30.000");
        } else {
            System.out.println("Anda member ? ");
            boolean member = input.nextBoolean();

            if (member) {
                System.out.println("Harga 45.000");
            } else {
                System.out.println("Harga 50.000");
            }

        }
    }
    
}
