// pyramid * pattern program in JAVA
import java.util.Scanner;

public class solution {
  public static void pyramid(int n) {
    for (int i = 1; i <= n; i++) { // row loop intialized with 1
      for (int j = 1; j <= n - i; j++) { // column loop
        System.out.print(" "); // print spaces before the stars
      }
      for (int j = 1; j <= i; j++) { // column loop
        System.out.print("* "); // print stars with spaces 
      }
      System.out.println(); // jump to second row
    }
  }
  public static void main(String[] args) {
    System.out.print("Enter the number of rows: ");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt(); // user input
    scanner.close();
    pyramid(n);
  }
}