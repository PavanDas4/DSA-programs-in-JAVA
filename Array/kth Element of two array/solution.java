import java.util.Scanner;

public class solution {
  public static int kthElement(int[] arr1, int[] arr2, int k) {
    int n = arr1.length, m = arr2.length;
    if (n > m)
      return kthElement(arr2, arr1, k);
    int lo = Math.max(0, k - m), hi = Math.min(k, n);
    while (lo <= hi) {
      int mid1 = (lo + hi) / 2;
      int mid2 = k - mid1;
      int l1 = (mid1 == 0 ? Integer.MIN_VALUE : arr1[mid1 - 1]);
      int r1 = (mid1 == n ? Integer.MAX_VALUE : arr1[mid1]);
      int l2 = (mid2 == 0 ? Integer.MIN_VALUE : arr2[mid2 - 1]);
      int r2 = (mid2 == m ? Integer.MAX_VALUE : arr2[mid2]);
      if (l1 <= r2 && l2 <= r1)
        return Math.max(l1, l2);
      if (l1 > r2)
        hi = mid1 - 1;
      else
        lo = mid1 + 1;
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.print("Enter the size of the first array & second array: ");
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int[] arr1 = new int[n1];
    int[] arr2 = new int[n2];
    System.out.print("Enter the elements of the first array: ");
    for (int i = 0; i < n1; i++) {
      arr1[i] = sc.nextInt();
    }
    System.out.print("Enter the elements of the second array: ");
    for (int i = 0; i < n2; i++) {
      arr2[i] = sc.nextInt();
    }
    System.out.print("Enter the value of k: ");
    int k = sc.nextInt();
    System.out.println("The " + k + "th element of the merged array is: " + kthElement(arr1, arr2, k));
    sc.close();
  }
}