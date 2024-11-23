
/*
 * Move all zeros to the end of the array
 * Input: [0, 0, 5, 10, 10, 0]
 * Output: [5, 10, 10, 0, 0, 0]
 */
import java.util.Arrays;

public class AllZeros_to_End {
  public static String EndZero(int[] arr) {
    int counter = 0; // initialize counter for traversing array
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0) { // if element is not zero
        arr[counter] = arr[i]; // assign element to counter
        counter++;
      }
    }
    for (int i = counter; i < arr.length; i++) {
      arr[i] = 0; // append remaining elements
    }
    return Arrays.toString(arr); // return array
  }

  public static void main(String[] args) {
    int[] arr = { 0, 0, 5, 10, 10, 0 };
    System.out.println(EndZero(arr));
  }
}