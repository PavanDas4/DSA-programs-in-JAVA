/*
 * Kth smallest element in an array
 * Smallest element in an array in kth position
 * Example: {3, 2, 1, 5, 6, 4} k=2
 * Output: 2
 */

import java.util.Arrays;
import java.util.Scanner;

public class kth_smallest_element {

  public static void main(String[] args) {
    System.out.print("Enter the size of the array: ");
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt(); // size of the array
    int[] arr = new int[size];
    System.out.println("Enter the elements of the array: ");
    for (int i = 0; i < size; i++) {
      arr[i] = scanner.nextInt(); // input array elements
    }
    System.out.print("Enter kth smallest number: ");
    int k = scanner.nextInt(); // kth smallest
    scanner.close();
    System.out.printf("%d th Largest element is: ", k);
    System.out.print(kthLargest(arr, k));
  }

  public static int kthLargest(int[] arr, int k) {
    Arrays.sort(arr); // sort the array
    return arr[k - 1]; // return kth smallest element
  }
}