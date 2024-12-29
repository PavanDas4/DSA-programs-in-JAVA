import java.util.Scanner;

public class solution {
  public static int[][] SetZero(int[][] mat, int[] n) {
    boolean frow = false, fcol = false;
    for (int i = 0; i < n[1]; i++) {
      if (mat[0][i] == 0) {
        frow = true;
        break;
      }
    }
    for (int i = 0; i < n[0]; i++) {
      if (mat[i][0] == 0) {
        fcol = true;
        break;
      }
    }
    for (int i = 1; i < n[0]; i++) {
      for (int j = 1; j < n[1]; j++) {
        if (mat[i][j] == 0) {
          mat[0][j] = 0;
          mat[i][0] = 0;
        }
      }
    }
    for (int i = 1; i < n[0]; i++) {
      for (int j = 1; j < n[1]; j++) {
        if (mat[i][0] == 0 || mat[0][j] == 0) {
          mat[i][j] = 0;
        }
      }
    }
    if (frow) {
      for (int i = 0; i < n[1]; i++) {
        mat[0][i] = 0;
      }
    }
    if (fcol) {
      for (int i = 0; i < n[0]; i++) {
        mat[i][0] = 0;
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
    System.out.println("Enter the elements of the mat: ");
    for (int i = 0; i < n[0]; i++) {
      for (int j = 0; j < n[1]; j++) {
        mat[i][j] = sc.nextInt();
      }
    }
    sc.close();
    SetZero(mat, n);
    System.out.println("The mat after setting zeros is: ");
    for (int i = 0; i < n[0]; i++) {
      for (int j = 0; j < n[1]; j++) {
        System.out.print(mat[i][j] + " ");
      }
      System.out.println();
    }
  }
}