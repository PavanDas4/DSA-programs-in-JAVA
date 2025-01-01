
// Rotate a Matrix by 180 Degree Counter Clockwise
import java.util.Scanner;

public class solution {
  public static void RotateMatrix(int[][] mat) {
    int n = mat.length;
    int m = mat[0].length;
    for (int i = 0; i < n / 2; i++) {
      for (int j = 0; j < m; j++) {
        int temp = mat[i][j];
        mat[i][j] = mat[n - i - 1][m - j - 1];
        mat[n - i - 1][m - j - 1] = temp;
      }
    }
    if (n % 2 != 0) {
      int mid = n / 2;
      for (int i = 0; i < m / 2; i++) {
        int temp = mat[mid][i];
        mat[mid][i] = mat[mid][m - i - 1];
        mat[mid][m - i - 1] = temp;
      }
    }
  }

  public static void main(String[] args) {
    System.out.print("Enter matrix size row = column: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] mat = new int[n][n];
    System.out.println("Enter matrix elements: ");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        mat[i][j] = sc.nextInt();
      }
    }
    RotateMatrix(mat);
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[i].length; j++) {
        System.out.print(mat[i][j] + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}