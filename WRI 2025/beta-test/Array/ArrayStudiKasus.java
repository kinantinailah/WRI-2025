import java.util.Scanner;

public class ArrayStudiKasus {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] grades = new int[10];
        int total=0;
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Masukan nilai mahasiswa ke"+(i+1)+":");
            grades[i] = sc.nextInt();
            total += grades[i];

        }
        double rataRata = total / grades.length;
        System.out.println("Rata rata dari 10 mahasiswa: "+rataRata);
    }
}
