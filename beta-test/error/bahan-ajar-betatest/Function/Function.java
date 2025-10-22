package Function;

public class Function {

  public static int hitungJumlah(int a, int b) {
    return a + b;
  }

  public static void main(String[] args) {
    int a = 10;
    int b = 8;
    int jumlah = hitungJumlah( a, b);

    System.out.println(jumlah);
  }
}

// Output yang diharapkan adalah hasil penjumlahan antara variabel a dan b
