// Positive Cumulative Sum
// Positive Cumulative is the sum of an arrays elements and filter it with removing negative elements
// example: [-1, -2, 4, 5] => [0, 0, 1, 6]

import java.util.Arrays;
import java.util.Scanner;

public class Positive_Cumulative_Sums {
  public static int[] PositiveCumulativeSum(int[] arr) {
    int[] cumSum = new int[arr.length]; // Create a new array to store the cumulative sum
    int[] PosCumSum = new int[arr.length]; // Create a new array to store the positive cumulative sum
    int sum = 0; // Initialize the sum variable
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i]; // Add the current element to the sum
      cumSum[i] = sum; // Store the cumulative sum in the new array
      if (cumSum[i] >= 0) { // Check if the cumulative sum is positive
        PosCumSum[i] = cumSum[i]; // Store the positive cumulative sum in the new array
      }
    }
    return PosCumSum; // Return the new array
  }

  public static int[] input() {
    System.out.print("Enter the size of the array: ");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt(); // size of the array
    int[] arr = new int[n]; // create an array with given size
    for (int i = 0; i < n; i++) {
      System.out.print("Enter element " + i + ": "); 
      arr[i] = scanner.nextInt(); // input elements
    }
    scanner.close();
    return arr; // return the array
  }

  public static void main(String[] args) {
    int[] arr = input(); // input the array
    System.out.println("Original Array: " + Arrays.toString(arr));
    System.out.println("Positive Cumulative Sum: " + Arrays.toString(PositiveCumulativeSum(arr)));
  }
}
/*
output:
Enter the size of the array: 4
Enter element 0: -1
Enter element 1: -2
Enter element 2: 4
Enter element 3: 5
Original Array: [-1, -2, 4, 5]
Positive Cumulative Sum: [0, 0, 1, 6]
 */