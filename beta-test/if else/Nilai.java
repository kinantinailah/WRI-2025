import java.util.Scanner;

public class Nilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Nilai UTS :");
        int nilaiuts = input.nextInt();

        System.out.println("Masukan Nilai UAS :");
        int nilaiuas =input.nextInt();

        double average = ((nilaiuas+nilaiuts)/2);

        if (average > 80 && average<=100);{
            System.out.println("Nilai akhir huruf = A ");
            System.out.println("Kualifikasi = SANGAT BAIK");
        else if (average >73 && average<=80) {
            System.out.println("Nilai akhir huruf = B+");
            System.out.println("Kualifikasi = LEBIH DARI BAIK");}
        else if (average>65 && average<=73);{
            System.out.println("Nilai akhir huruf = B");
            System.out.println("Kualifikasi = BAIK");}
        else if (average > 60 && average<=65);{
            System.out.println("Nilai akhir huruf = C+ ");
            System.out.println("Kualifikasi = LEBIH DARI CUKUP");}
        else if (average > 50 && average<=60);{
            System.out.println("Nilai akhir huruf = C ");
            System.out.println("Kualifikasi = CUKUP");}}
    if (average <=49);{
        System.out.println("Nilai akhir huruf = E ");
        System.out.println("Kualifikasi = GAGAL");}
            
            
        





    }
    
}
