
// Find the second largest element in an array
import java.util.Arrays;

public class solution {
  public static int sol(int[] arr) {
    Arrays.sort(arr); // sort the array
    int largest = arr[arr.length - 1]; // get the largest element
    int secondLargest = -1; // initialize the second largest element
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < largest && arr[i] != largest) {
        // check if the current element is smaller than the largest element and not
        // equal
        secondLargest = arr[i]; // update the second largest element
      }
    }
    return secondLargest;
  }

  public static void main(String[] args) {
    int[] arr = { 3, 2, 1, 5, 5, 4 };
    System.out.println(sol(arr));
  }
}