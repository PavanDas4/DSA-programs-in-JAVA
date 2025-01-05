
// Peak element is the element which is greater than or equal to its neighbours. Given an array arr[] of size n
import java.util.Scanner;

public class solution {
  public static int peakElement(int[] arr) {
    int n = arr.length;
    if (n == 1)
      return 0;
    if (arr[0] > arr[1])
      return 0;
    if (arr[n - 1] > arr[n - 2])
      return n - 1;
    int lo = 1, hi = n - 2;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
        return mid;
      if (arr[mid] < arr[mid + 1])
        lo = mid + 1;
      else
        hi = mid - 1;
    }
    return 0;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements in the array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of the array: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    System.out.println("The peak element is at index: " + peakElement(arr));
  }
}