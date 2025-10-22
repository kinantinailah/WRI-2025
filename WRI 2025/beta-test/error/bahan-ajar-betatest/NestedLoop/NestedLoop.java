package NestedLoop;

public class NestedLoop {

  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j< i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

// Output yang diharapkan adalah "Sebuah Segitiga dengan tinggi 10"
