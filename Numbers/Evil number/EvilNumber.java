
// Evil number is a number which has even numbers of 1's in bin form
// example : 10 >> 1010 ∴ there are two 1's hence the number is evil number
import java.util.Scanner;

public class EvilNumber {
  public static boolean isEvil(int num) { // Evil function
    int count = 0; // initialized count of 1's to 0
    while (num > 0) { // loop 
      count += num & 1; // check the bit from right and perform AND and add to count
      num >>= 1; // right shift by 1
    }
    return count % 2 == 0; // is count is even
  }

  public static void main(String[] args) {
    System.out.print("Enter the number: ");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt(); // input
    scanner.close();
    if (isEvil(n)) // check condition
      System.out.printf("%d is an evil number.", n);
    else
      System.out.printf("%d is not an evil number.", n);
  }
}
/*
output: 
Enter the number: 10
10 is an evil number.
 */