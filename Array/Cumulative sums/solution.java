
// Cumulative sums of an Array
import java.util.Arrays;
import java.util.Scanner;

public class solution {
  public static int[] CumulativeSum(int[] arr) {
    int sum = 0; // initialize sum
    int[] arr2 = new int[arr.length]; // initialize arr2
    for (int i = 0; i < arr.length; i++) { // loop
      sum += arr[i]; // add arr[i] to sum
      arr2[i] = sum; // add sum to arr2
    }
    return arr2; // return arr2
  }

  public static int[] input() { // input array
    System.out.print("Enter the number of elements: ");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt(); // number of elements
    int[] arr = new int[num]; // initialize array
    for (int i = 0; i < num; i++) {
      arr[i] = scanner.nextInt(); // add elements
    }
    scanner.close();
    return arr; // return array
  }

  public static void main(String[] args) {
    int[] arr = input(); // input array
    System.out.println(Arrays.toString(CumulativeSum(arr))); // print cumulative sum array
  }
}