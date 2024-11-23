// Floyd's Triangle pyramid pattern
public class solution {
  public static void main(String[] args) {
    int k = 1; // intialized number variable for increment in every elements
    int n = 4; // number of rows
    for (int i = 1; i <= n; i++) { // nested loop and rows
      for (int j = 0; j <= n - i; j++) { // column loop which prints spaces
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) { // column loop which prints numbers
        System.out.print(k + " ");
        k++; // incrementing number
      }
      System.out.println(); // for new line
    }
  }
}
/*
output:
    1
   2 3
  4 5 6
 7 8 9 10
 */