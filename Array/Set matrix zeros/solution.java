import java.util.Scanner;

public class solution {
  public static int[][] SetZero(int[][] mat, int[] n) {
    for (int i = 0; i < n[0]; i++) {
      for (int j = 0; j < n[1]; j++) {
        if (mat[i][j] == 0) {
          mat[0][j] = 0;
          mat[i][0] = 0;
        }
      }
    }
    for (int i = 1; i < n[0]; i++) {
      if (mat[i][0] == 0) {
        for (int j = 0; j < n[1]; j++) {
          mat[i][j] = 0;
        }
      }
    }
    for (int j = 1; j < n[1]; j++) {
      if (mat[0][j] == 0) {
        for (int i = 0; i < n[0]; i++) {
          mat[i][j] = 0;
        }
      }
    }
    if (mat[0][0] == 0) {
      for (int j = 0; j < n[1]; j++) {
        mat[0][j] = 0;
      }
    }
    return mat;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] n = new int[2];
    System.out.print("Enter the number of rows and columns: ");
    n[0] = sc.nextInt();
    n[1] = sc.nextInt();
    int[][] mat = new int[n[0]][n[1]];
    System.out.println("Enter the elements of the matrix: ");
    for (int i = 0; i < n[0]; i++) {
      for (int j = 0; j < n[1]; j++) {
        mat[i][j] = sc.nextInt();
      }
    }
    sc.close();
    SetZero(mat, n);
    System.out.println("The matrix after setting zeros is: ");
    for (int i = 0; i < n[0]; i++) {
      for (int j = 0; j < n[1]; j++) {
        System.out.print(mat[i][j] + " ");
      }
      System.out.println();
    }
  }
}