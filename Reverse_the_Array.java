// import Arrays module to print the array
import java.util.Arrays;

public class Reverse_the_Array {
  // create a function to reverse an array
  public static String reverseArray(int[] arr) {
    // initialize three variables 
    int head, end, temp;
    head = 0; // initialize head as first index of array
    end = arr.length - 1; // initialize end as last index of array
    // run the loop until head is less than or equal to end
    while (end > head) {
      // swap the elements
      temp = arr[head];
      arr[head] = arr[end];
      arr[end] = temp;
      head++;
      end--;
    }
    return Arrays.toString(arr);
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    System.out.println("Original Array: " + Arrays.toString(arr));
    System.out.println("Reversed Array: " + reverseArray(arr));
  }
}
