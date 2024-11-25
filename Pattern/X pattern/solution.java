// X pattern program with OR operator

import java.util.Scanner;

public class solution {
  public static void X(int n) {
    for (int i = 1; i <= n; i++) { // row
      for (int j = 1; j <= n; j++) { // column
        if (j == i || i + j == n + 1) // conditions
          System.out.print("* "); // for values
        else
          System.out.print("  "); // empty spaces for non values
      }
      System.out.println(); // new line
    }
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.close();
    X(n);
  }
}