// X pattern program with OR operator
public class X_pattern {
  public static void main(String[] args) {
    int n = 5; // size
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
}
/*
Output:
*       *
  *   *
    *
  *   *
*       *
*/