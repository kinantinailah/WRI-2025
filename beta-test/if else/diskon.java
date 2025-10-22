import java.util.Scanner;

public class diskon {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print( "Masukan kode:");
        String diskon = input.nextLine();

        if (diskon.equals("DISKON 20%")) {
            System.out.println("DISKON 20%");
        } else if (diskon.equals("DISKON 10%")) {
            System.out.println("DISKON 10%");
        } else if (diskon.equals("DISKON5")) {
            System.out.println("DISKON 5%");
         } else {
            System.out.println("KODE TIDAK VALID.");
         }
    }
}