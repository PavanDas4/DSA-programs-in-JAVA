
// Kadane's Algorithm
import java.util.Scanner;

public class solution {
  public static int maxSubarraySum(int[] arr) {
    int currSum = 0; // Initial sum
    int maxSum = Integer.MIN_VALUE; // -2^31
    for (int i = 0; i < arr.length; i++) {
      currSum += arr[i]; // Increment sum
      if (currSum > maxSum) { // Update maxSum
        maxSum = currSum; 
      }
      if (currSum < 0) { // Reset sum
        currSum = 0;
      }
    }
    return maxSum;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    System.out.println(maxSubarraySum(arr));
  }
}