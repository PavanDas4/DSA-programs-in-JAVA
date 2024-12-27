// Two Sum - Pair with Target Sum
import java.util.Scanner;
import java.util.HashSet;

public class solution {
  public static boolean TwoSum(int[] arr, int target) {
    HashSet<Integer> set = new HashSet<>();
    for (int num : arr) {
      if (set.contains(target - num)) {
        return true;
      }
      set.add(num);
    }
    return false;
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
    System.out.println(TwoSum(arr, target)? "True" : "False");
    scanner.close();
  }
}