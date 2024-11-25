// Pasdal's triangle
import java.util.Scanner;

public class solution {
  public static void pascal(int n) {
    for (int i = 0; i <= n; i++) {
      for (int j = 0; j <= n - i; j++) {
        System.out.print(" ");
      }
      int k = 1; // for number appearance and for starting number track
      for (int j = 1; j <= i; j++) {
        System.out.print(k + " ");
        k = k * (i - j) / (j); // calculate based on appearance of row according to element
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.close();
    pascal(n);
  }
}