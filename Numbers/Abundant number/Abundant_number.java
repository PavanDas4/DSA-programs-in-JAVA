// Abundant number is an number which is lesser than the sum of its proper divisors except the number itself.
// example 12 is an Abundant number because 12 = 1 + 2 + 3 + 4 + 6 = 16 > 12
import java.util.Scanner;

public class Abundant_number {
  public static boolean isAbundant(int n) {
    int sum = 0; // initilaize sum 
    for (int i = 1; i <= n / 2; i++) { // run loop till half of n
      if (n % i == 0) { // check if n is divisible by i
        sum += i; // add i to sum
      }
    }
    return n < sum; // return true if n is lesser than sum
  }

  public static void main(String[] args) {
    System.out.print("Enter the number: ");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt(); /// take input
    scanner.close();
    if (isAbundant(n)) { // check if n is Abundant
      System.out.printf("%d is an Abundant number", n);
    } else {
      System.out.printf("%d is not an Abundant number", n);
    }
  }
}
