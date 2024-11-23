// pyramid * pattern program in JAVA
import java.util.Scanner;

public class Pyramid_Pattern {
  public static void main(String[] args) {
    System.out.print("Enter the number of rows: ");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt(); // user input
    scanner.close();
    for (int i = 1; i <= num; i++) { // row loop intialized with 1
      for (int j = 1; j <= num - i; j++) { // column loop
        System.out.print(" "); // print spaces before the stars
      }
      for (int j = 1; j <= i; j++) { // column loop
        System.out.print("* "); // print stars with spaces 
      }
      System.out.println(); // jump to second row
    }
  }
}
/* 
Output: 
Enter the number of rows: 5
    *
   * *
  * * *
 * * * *
* * * * *
*/ 