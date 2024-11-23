
/*
 * Sum is 0 of a sorted array
 * Program to check if array contains a pair with sum 0
 * Example: arr = {-3, 1, 2, -2, 5, 6} => true
 */
import java.util.Arrays;
import java.util.Scanner;

public class Two_Sum_Sorted {
  public static boolean hassum0(int[] arr) {
    boolean flag = false;
    for (int i = 0; i < arr.length; i++) { // first pointer
      for (int j = 0; j < arr.length; j++) { // second pointer
        if (arr[i] + arr[j] == 0) { // check if sum is 0
          flag = true; // set flag to true
          break;
        }
      }
    }
    return flag;
  }

  public static void main(String[] args) {
    System.out.print("Enter the size of the array: ");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt(); // take size
    int[] arr = new int[n];
    System.out.print("Enter the elements of the array: ");
    while (n != 0) {
      n--;
      arr[n] = scanner.nextInt(); // take input
    }
    scanner.close();
    Arrays.sort(arr); // sort the array
    System.out.println("Array: " + Arrays.toString(arr)); // print the array
    System.out.println("Does array contain a pair with sum 0?: " + hassum0(arr));
  }
}