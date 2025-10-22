import java.util.Scanner;

public class taskNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] menu = {"kopi","teh","roti"};
        int x =0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Masukan nama pelanggan:");
            String pelanggan = sc.nextLine();

            for (int j = 0; j < menu.length; j++) {
                System.out.print("jumlah" + menu [j] + ":");
                int jumlah = sc.nextLine();
                x += jumlah;
                
            }

            System.out.println();
            sc.nextLine();
        }
        

        
    }
    
}
