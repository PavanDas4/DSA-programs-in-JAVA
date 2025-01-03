// Intersection of two arrays with duplicate elements

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class solution {
  public static ArrayList<Integer> Intersection(int[] a, int[] b) {
    ArrayList<Integer> intersect = new ArrayList<>();
    Arrays.sort(a);
    Arrays.sort(b);
    int i = 0, j = 0;
    while (i < a.length && j < b.length) {
      if (i > 0 && a[i - 1] == a[i]) {
        i++;
        continue;
      }
      if (a[i] < b[j]) {
        i++;
      } else if (a[i] > b[j]) {
        j++;
      } else {
        intersect.add(a[i]);
        i++;
        j++;
      }
    }
    return intersect;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int m = sc.nextInt();
    int[] b = new int[m];
    for (int i = 0; i < m; i++) {
      b[i] = sc.nextInt();
    }
    sc.close();
    ArrayList<Integer> result = Intersection(a, b);
    for (int num : result) {
      System.out.print(num + " ");
    }
  }
}