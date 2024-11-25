// hollow_hourglass pattern

import java.util.Scanner;

public class solution {
  public static void hourglass(int n) {
    int i, j; // initialized loop variables
    // upper inverted triangle
    for (i = 1; i <= n; i++) { // row loop
      for (j = 1; j < i; j++)
        System.out.print(" "); // inserting space in empty column
      for (j = i; j <= n; j++) {
        if (j == i || j == n || i == 1)
          System.out.print("* "); // condition based on column and row
        else
          System.out.print("  "); // inserting space which doesnt match conditions
      }
      System.out.println(); // new line
    }
    //lower trianglr
    for (i = n - 1; i >= 1; i--) {
      for (j = 1; j < i; j++)
        System.out.print(" ");
      for (j = i; j <= n; j++) {
        if (j == i || j == n || i == 1)
          System.out.print("* ");
        else
          System.out.print("  ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.close();
    hourglass(n);
  }
}
