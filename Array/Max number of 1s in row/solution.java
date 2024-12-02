// Find the Row with Maximum Number of 1s
import java.util.Scanner;

public class solution {
  public static int max1Row(int[][] matrix) {
    final int row = matrix.length; // rows
    final int col = matrix[0].length; // columns
    int max = 0; // maximum number of 1s
    int rowIndex = -1; // row index
    for (int i = 0; i < row; i++) {
      int count = 0; // count
      for (int j = 0; j < col; j++) {
        if (matrix[i][j] == 1) // if 1
          count++; // increment
      }
      if (count > max) { // if count greater than max
        rowIndex = i;
        max = count;
      }
    }
    return rowIndex++; // return rowIndex
  }
  public static void main(String[] args) {
    System.out.print("Enter the matrix row & column size: ");
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int col = sc.nextInt();
    int[][] matrix = new int[row][col];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] == 1 || matrix[i][j] == 0) // accept 1 or 0
          matrix[i][j] = sc.nextInt();
        else {
          System.out.println("Invalid input");
          j--;
        }
      }
    }
    sc.close();
    System.out.println("Actual Row with maximum number of 1s: " + max1Row(matrix));
  }
}
