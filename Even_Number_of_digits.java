/*
 * Even Number of Digits
 * Given an array of integers, return a new array such that each element with an even number of digits
 * Example: [1, 23, 456, 7890] -> [23, 7890]
 * Number of Digits in 23 and 7890 i.e 2 and 4 which are even numbers
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Even_Number_of_digits {
  public static ArrayList<Integer> EvenNumbers(int[] arr) {
    ArrayList<Integer> even = new ArrayList<Integer>(); // Declaring the arraylist
    for (int i = 0; i < arr.length; i++) {
      if (NumberOfDigits(arr[i]) % 2 == 0) { // Checking if the number of digits is even
        even.add(arr[i]); // Adding the number to the arraylist
      }
    }
    return even;
  }

  public static int NumberOfDigits(int num) {
    int count = 0;
    while (num != 0) { // counting the number of digits
      num = num / 10; // Dividing the number by 10
      count++; // Incrementing the count
    }
    return count;
  }

  public static int[] input(int n) {
    Scanner scanner = new Scanner(System.in);
    int[] arr = new int[n]; // Declaring the array of size n
    System.out.print("Enter " + n + " Integers: ");
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt(); // input adding to the array
    }
    scanner.close();
    return arr;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int n = scanner.nextInt(); // Accepting the size of the array
    int[] arr = input(n); // Calling the input function
    System.out.println("Numbers with even digits: " + EvenNumbers(arr));
    scanner.close();
  }
}
/*
 * Output:
 * Enter the size of the array: 4
 * Enter 4 Integers: 1 23 456 7890
 * [23, 7890]
 */