
// Amicable Pairs 
// Pairs of numbers for which the sum of the divisors of each number is equal to the other number.
// example: 220 and 284
import java.util.Scanner;

public class AmicablePairs {
  public static boolean isAmicable(int x, int y) {
    if (SumOfDivisors(x) == y && SumOfDivisors(y) == x) {
      return true;
    }
    return false;
  }

  public static int SumOfDivisors(int x) {
    int sum = 0;
    for (int i = 1; i < x; i++) {
      if (x % i == 0) {
        sum += i;
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    System.out.println("Enter two numbers: ");
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    scanner.close();
    if (isAmicable(x, y)) {
      System.out.printf("%d and %d are amicable pairs.", x, y);
    } else {
      System.out.printf("%d and %d are not amicable pairs.", x, y);
    }
  }
}