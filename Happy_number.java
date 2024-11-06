import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Happy_number {
  public static boolean happy(int num) {
    Set<Integer> seen = new HashSet<>();
    while (num != 1 && !seen.contains(num)) {
      seen.add(num);
      num = SumOfExpo(num);
    }
    return num == 1;
  }

  public static int SumOfExpo(int num) {
    int sum = 0;
    while (num > 0) {
      int unit = num % 10;
      sum += Math.pow(unit, 2);
      num /= 10;
    }
    return sum;
  }

  public static void main(String[] args) {
    System.out.print("Enter the number: ");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    scanner.close();
    if (happy(num)) {
      System.out.printf("%d is a happy number", num);
    } else {
      System.out.printf("%d is not a happy number", num);
    }
  }
}
