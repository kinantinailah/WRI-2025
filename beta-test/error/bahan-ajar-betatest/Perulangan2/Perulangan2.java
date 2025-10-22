package Perulangan2;

import java.util.Scanner;

public class Perulangan2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int total = 0;
    System.out.print("Masukkan N: ");
    int n = sc.nextInt();
    System.out.print("Masukkan M: ");
    int m = sc.nextInt();

    for (int i = 0; i < m; i++) {
      total *= m;
    }

    System.out.println(total);
  }
}

// Output yang diharapkan adalah hasil operasi matematika dari n pangkat m
