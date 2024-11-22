/*
 * Majority Element
 * Given an integer array of size n, find all elements that appear more than 3 times.
 * Input: nums = [1,2,3,2,2,3,5,4,3]
 * Output: [3,2]
 */

import java.util.ArrayList;
import java.util.List;

public class Majority_Element {
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
    int[] arr = { 1, 2, 3, 2, 2, 3, 5, 4 };
    System.out.println(majorityElement(arr));
  }
}
