public class bayardiskon {
    public static void main(String[] args) {
         double hargaAkhir = diskon(100000.0, 15.0);
        System.out.println("harga yang harus dibayar: Rp"+hargaAkhir);
    }
    static double diskon(double a, double b){
        return a-(a*b/100);
    }
    
}
