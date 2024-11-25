// Pyramid of numbers pattern

import java.util.Scanner;

public class solution {
  public static void pyramid(int n) {
    int k = 1; // intialized number variable for increment in every elements
    for (int i = 1; i <= n; i++) { // nested loop and rows
      for (int j = 0; j <= n - i; j++) { // column loop which prints spaces
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) { // column loop which prints numbers
        System.out.print(k + " ");
        k++; // incrementing number
      }
      System.out.println(); // for new line
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.close();
    pyramid(n);
  }
}