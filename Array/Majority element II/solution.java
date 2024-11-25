
// Majority element II
import java.util.ArrayList;
import java.util.Arrays;

public class solution {
  public static ArrayList<Integer> Majority(int[] arr) {
    ArrayList<Integer> list = new ArrayList<Integer>(); // Declaring the arraylist
    Arrays.sort(arr); // Sorting the array
    for (int i = 0; i < arr.length; i++) {
      if (i == 0 || arr[i] != arr[i - 1]) {
        int count = 1; // initializing count
        while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
          count++; // incrementing count
          i++;
        }
        if (count > arr.length / 3 && !list.contains(arr[i])) { // check if count is greater than n/3
          list.add(arr[i]);
        }
      }
    }
    return list;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 2, 3, 1, 3, 2, 1, 1 };
    System.out.println(Arrays.toString(Majority(arr).toArray()));
    // Convert ArrayList to array and then convert array to string
  }
}