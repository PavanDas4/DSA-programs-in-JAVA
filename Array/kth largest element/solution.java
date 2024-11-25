
// Kth largest element in an array
import java.util.Arrays;
import java.util.Scanner;

public class solution {

  public static void main(String[] args) {
    System.out.print("Enter the size of the array: ");
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt(); // size of the array
    int[] arr = new int[size];
    System.out.println("Enter the elements of the array: ");
    for (int i = 0; i < size; i++) {
      arr[i] = scanner.nextInt(); // input array elements
    }
    System.out.print("Enter kth largest number: ");
    int k = scanner.nextInt(); // kth largest
    scanner.close();
    System.out.printf("%d th Largest element is: ", k);
    System.out.print(kthLargest(arr, k));
  }

  public static int kthLargest(int[] arr, int k) {
    Arrays.sort(arr); // sort the array
    return arr[arr.length - k]; // return kth largest element
  }
}