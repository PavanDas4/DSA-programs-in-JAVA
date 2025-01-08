import java.util.Arrays;
import java.util.Scanner;

public class solution {
  public static void sort012(int[] arr, int n) {
    int low = 0, mid = 0, high = 0, idx = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] == 0) {
        low += 1;
      } else if (arr[i] == 1) {
        mid += 1;
      } else {
        high += 1;
      }
    }
    for (int i = 0; i < low; i++)
      arr[idx++] = 0;
    for (int i = 0; i < mid; i++)
      arr[idx++] = 1;
    for (int i = 0; i < high; i++)
      arr[idx++] = 2;
  }

  public static void main(String[] args) {
    System.out.print("Enter the size of the array: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.print("Enter the elements of the array: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    sort012(arr, n);
    System.out.print("The sorted array is: " + Arrays.toString(arr));
  }
}
