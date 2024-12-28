
// Two Sum - Pair with Target Sum
import java.util.Scanner;
import java.util.HashMap;

public class solution {
  public static int TwoSum(int[] arr, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int count = 0;
    for (int num : arr) {
      if (map.containsKey(target - num)) {
        count += map.get(target - num);
      }
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.print("Enter the number of elements in the array: ");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] arr = new int[n];
    System.out.print("Enter the elements of the array: ");
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }
    System.out.print("Enter the target sum: ");
    int target = scanner.nextInt();
    System.out.println(TwoSum(arr, target));
    scanner.close();
  }
}