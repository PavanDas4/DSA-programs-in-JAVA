// Rotate Array
public class solution {
  public static String rotate(int[] nums, int k) {
    for (int i = 0; i < k; i++) {
      int head = nums[0]; // element to be shifted
      for (int j = 0; j < nums.length - 1; j++) {
        nums[j] = nums[j + 1]; // shift elements to left
      }
      nums[nums.length - 1] = head; // shift first element to end
    }
    return java.util.Arrays.toString(nums);
  }

  public static void main(String[] args) {
    int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
    int k = 3;
    System.out.println("Rotated Array: " + rotate(nums, k));
  }
}