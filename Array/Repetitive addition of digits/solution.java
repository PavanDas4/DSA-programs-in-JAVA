// Repetitive Addition Of Digits

import java.util.Scanner;

public class solution {
  public static int singleDigit(int n) {
    if (n < 10) { // check for single digit
      return n;
    }
    int sum = 0; // initialize sum
    while (n > 0) { // add all digits
      sum += n % 10; // add last digit
      n /= 10; // remove last digit
    }
    return singleDigit(sum); // recursive call
  }

  public static void main(String[] args) {
    System.out.println("Enter a number: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    System.out.println(singleDigit(n));
  }
}
