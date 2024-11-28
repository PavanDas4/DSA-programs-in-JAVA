// Stock buy and sell - max one transaction

import java.util.Scanner;

public class solution {
  public static int maxProfit(int[] arr) {
    int min = arr[0]; // minimum element
    int res = 0; // maximum profit
    for (int i = 1; i < arr.length; i++) {
      min = Math.min(min, arr[i]); // updating minimum element
      res = Math.max(res, arr[i] - min); // updating maximum profit
    }
    return res;
  }
  public static void main(String[] args) {
    System.out.println("Enter the size of the array: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    System.out.println(maxProfit(arr));
  }
}
