// Happy number is an number which appears 1 after sum of squares of its digits
// example 19 = 1^2 + 9^2 = 82 = 8^2 + 2^2 = 68 = 6^2 + 8^2 = 100 = 1^2 = 1
// prerequiste modules
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Happy_number {
  public static boolean isHappy(int n) { // Happy number function
    Set<Integer> set = new HashSet<>(); // to avoid infinite loop
    while (n != 1 && !set.contains(n)) { // check if n is 1 and if n is not in set
      set.add(n);  // add n to set
      n = SumOfDigits(n); // sum of squares of its digits
    }
    return n == 1; // return true if n is 1
  }

  public static int SumOfDigits(int n) { // sum of squares of its digits
    int sum = 0; // initialize sum
    while (n != 0) { // loop until n is 0
      sum += Math.pow(n % 10, 2); // sum of squares of its digits
      n /= 10;
    }
    return sum;
  }

  public static void main(String[] args) {
    System.out.print("Enter a number: ");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt(); // input
    scanner.close();
    if (isHappy(n)) { // check if n is a happy number
      System.out.printf("%d is an happy number", n);
    } else {
      System.out.printf("%d is not an happy number", n);
    }

  }
}