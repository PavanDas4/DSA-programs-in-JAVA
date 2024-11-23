// Pronic Number
// A pronic number is a number that is the product of two consecutive integers.
// For example, 24 is a pronic number as 24 = 2 * 3. where 2 and 3 are two consecutive integers. i & i+1

import java.util.Scanner;

public class PronicNumber {
  public static boolean isPronic(int num) {
    boolean flag = false; // flag to check if number is pronic
    for (int i = 1; i <= num / 2; i++) { // loop from 1 to n/2
      if (i * (i + 1) == num) { // check if i * (i + 1) == num
        flag = true; // set flag to true
        break;
      }
    }
    return flag; // return flag
  }

  public static void main(String[] args) {
    System.out.print("Enter a number: ");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt(); // user input
    scanner.close();
    if (isPronic(num)) { // check if number is pronic
      System.out.println(num + " is a pronic number.");
    } else {
      System.out.println(num + " is not a pronic number.");
    }
  }
}

/*
output: 
Enter a number: 24
24 is a pronic number.
 */