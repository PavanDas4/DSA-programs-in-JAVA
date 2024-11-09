// Deficient number is an number which is greater than the sum of its proper divisors except the number itself.
// example 9 : proper divisors are 1, 3 = 4 > 9
import java.util.Scanner;

public class Deficient_number {
  public static boolean isDeficient(int n) {
    int sum = 0; // initilaize sum 
    for (int i = 1; i < n / 2; i++) { // run loop till half of n
      if (n % i == 0) { // check if n is divisible by i
        sum += i; // add i to sum
      }
    }
    return n > sum; // return true if n is greater than sum
  }

  public static void main(String[] args) {
    System.out.print("Enter the number: ");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt(); /// take input
    scanner.close();
    if (isDeficient(n)) { // check if n is deficient
      System.out.printf("%d is an deficient number", n);
    } else {
      System.out.printf("%d is not an deficient number", n);
    }
  }
}
