//Majority Element II

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class solution {
  public static List<Integer> majorityElement(int[] nums) {
    List<Integer> max3 = new ArrayList<>(); // List to store the majority elements
    for (int i : nums) { // Iterate through the array
      int target = nums[i]; // Get the current element
      int count = 1; // Initialize the count
      for (int j = 0; j < nums.length; j++) {
        if (nums[j] == target) { // Count the number of occurrences
          count++;
        }
      }
      if (count > 3 && !max3.contains(target)) {
        // If the count is greater than 3 and the element is not already in the list
        max3.add(target);
      }
    }
    return max3;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    System.out.println(majorityElement(arr));
  }
}