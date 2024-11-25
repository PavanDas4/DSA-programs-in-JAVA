
// Floyd's Triangle
import java.util.Scanner;

public class solution {
  public static void floyd(int n) {
    int k = 1; // intialized number variable
    for (int i = 1; i <= n; i++) { // nested loop and rows
      for (int j = 1; j <= i; j++) {
        System.out.print(k + " "); // print numbers
        k++; // increment
      }
      System.out.println(); // for new line
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int n = scanner.nextInt(); // input
    scanner.close();
    floyd(n);
  }
}