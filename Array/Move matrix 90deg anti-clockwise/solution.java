// Roate matrix 90 degree anti-clockwise

import java.util.Scanner;

public class solution {
  static void rotate90(int[][] mat) {
    int n = mat.length;
    int[][] res = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        res[n - j - 1][i] = mat[i][j];
      }
    }
    for (int i = 0; i < n; i++) {
      System.arraycopy(res[i], 0, mat[i], 0, n);
    }
  }

  public static void main(String[] args) {
    System.out.println("Rotate matrix 90 degree anti-clockwise");
    System.out.println("Enter the size of the matrix");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] mat = new int[n][n];
    System.out.println("Enter the elements of the matrix");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        mat[i][j] = sc.nextInt();
      }
    }
    sc.close();
    rotate90(mat);
    for (int[] row : mat) {
      for (int x : row) {
        System.out.print(x + " ");
      }
      System.out.println();
    }
  }
}