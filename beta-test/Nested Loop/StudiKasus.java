import java.util.Scanner;

public class StudiKasus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights  = new double[4];
        double total = 0;

        for (int i = 0; i < heights.length; i++) {
            System.out.print("Masukan tinggi badan: "+(i+1)+":");
            heights[i] = sc.nextDouble();
            total += heights[i];
            
        }
        double rataRata = total / heights.length;
        System.out.print("rata rata tinggi dari 4 orang: " + rataRata);
    }
    
}
