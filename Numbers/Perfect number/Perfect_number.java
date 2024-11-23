// Perfect number is an number which is equal to the sum of its proper divisors except the number itself.
// example: 6 is a perfect number because 6 = 1 + 2 + 3
import java.util.Scanner;

public class Perfect_number {
  public static boolean isPerfect(int n) {
    int sum = 0; // initilaize sum 
    for (int i = 1; i <= n / 2; i++) { // run loop till half of n
      if (n % i == 0) { // check if n is divisible by i
        sum += i; // add i to sum
      }
    }
    return n == sum; // return true if n is equal to the sum
  }

  public static void main(String[] args) {
    System.out.print("Enter the number: ");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt(); /// take input
    scanner.close();
    if (isPerfect(n)) { // check if n is Perfect
      System.out.printf("%d is an Perfect number", n);
    } else {
      System.out.printf("%d is not an Perfect number", n);
    }
  }
}
