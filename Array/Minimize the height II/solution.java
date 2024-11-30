// Minimize the height II
import java.util.Arrays;
import java.util.Scanner;

public class solution {
  public static int minHeight(int[] arr, int n, int k) {
    Arrays.sort(arr); // Sort the array
    int res = arr[n - 1] - arr[0]; // Initialize result
    for (int i = 1; i < n; i++) {
      if (arr[i] - k < 0) { // If the current height after subtracting k is less than 0, skip it
        continue;
      }
      int minH = Math.min(arr[0] + k, arr[i] - k); // Calculate the minimum height
      int maxH = Math.max(arr[i - 1] + k, arr[n - 1] - k); // Calculate the maximum height
      res = Math.min(res, maxH - minH); // Update the result
    }
    return res;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.print("Enter the array: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.print("Enter the value of k: ");
    int k = sc.nextInt();
    sc.close();
    System.out.println(minHeight(arr, n, k));
  }
}