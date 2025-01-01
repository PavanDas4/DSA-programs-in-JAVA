import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class solution {
  public static int union(int[] a, int[] b) {
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < a.length; i++) {
      set.add(a[i]);
    }
    for (int i = 0; i < b.length; i++) {
      set.add(b[i]);
    }
    return set.size();
  }
  public static void main(String[] args) {
    System.out.print("Enter the number of elements array 1 & 2(eg., 3 4): ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[m];
    System.out.print("Enter the elements for array 1: ");
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    System.out.print("Enter the elements for array 2: ");
    for (int i = 0; i < m; i++) {
      b[i] = sc.nextInt();
    }
    System.out.println("The union of the two arrays is: " + union(a, b));
    sc.close();
  }
}