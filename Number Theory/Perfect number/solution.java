
// Perfect number
import java.util.Scanner;

public class solution {
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
