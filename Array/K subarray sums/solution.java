
// K Subarray Sum
import java.util.Arrays;

public class solution {
  public static void main(String[] args) {
    int[] arr = { 3, 5, 6, 2, 4, 7, 8 }; // input array
    int k = 3; // size of subarray
    int[] arr2 = new int[arr.length - k + 1]; // output array
    for (int i = 0; i <= arr.length - k; i++) { // loop through input array
      int sum = 0; // sum of subarray
      sum = arr[i] + arr[i + 1] + arr[i + 2]; // sum of subarray
      arr2[i] = sum; // add sum to output array
    }
    System.out.println(Arrays.toString(arr2)); // print output array
  }
}