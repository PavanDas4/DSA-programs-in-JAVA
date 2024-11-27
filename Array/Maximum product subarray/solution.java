// Maximum product subarray

import java.util.Scanner;

public class solution {
  public static int maxProduct(int[] arr) {
    int n = arr.length; // size of array
    int max = arr[0]; // maximum element
    int min = arr[0]; // minimum element
    int maxProduct = arr[0]; // maximum product
    for (int i = 1; i < n; i++) { // iterate over array start at index 1
      int temp = Math.max(arr[i], Math.max(arr[i] * max, arr[i] * min)); // check max element
      min = Math.min(arr[i], Math.min(arr[i] * max, arr[i] * min)); // update min
      max = temp; // update max
      maxProduct = Math.max(maxProduct, max); // Check max value
    }
    return maxProduct;
  }
  public static void main(String[] args) {
    System.out.print("Enter array length: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.print("Enter array elements: ");
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    System.out.println("Maximum product subarray: " + maxProduct(arr));
  }
}