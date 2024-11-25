// Armstrong number
import java.util.Scanner;

public class solution{

  // Function to check if a number is an Armstrong number
  public static boolean isArmstrong(int number) {
    String str = Integer.toString(number); // convert number to string for getting length
    int sum = 0; // initialize sum
    for (int i = 0; i < str.length(); i++) {
      sum += Math.pow(Integer.parseInt(str.charAt(i) + ""), str.length());
      // calculate sum of power of individual digits by length of number
    }
    return sum == number; // return true if sum is equal to number
  }

  public static void main(String[] args) {
    System.out.print("Enter a number: ");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt(); // get user input
    scanner.close();
    if (isArmstrong(number)) { // if isArmstrong returns true
      System.out.println(number + " is an Armstrong number.");
    } else {
      System.out.println(number + " is not an Armstrong number.");
    }
  }
}