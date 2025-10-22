import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = "hehe";
        do {
            System.out.println("Masukan Password :");
            String pwinput = input.nextLine();
            if (pwinput.equals(password)) {
                System.out.println("Anda berhasil login");
                break;
                
            }
        } while (true);
            
        
    }
}
