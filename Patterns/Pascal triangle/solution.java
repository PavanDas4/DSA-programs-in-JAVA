public class solution {
  public static void main(String[] args) {
    int n = 4; // number of rows in the triangle
    for (int i = 0; i <= n; i++) {
      for (int j = 0; j <= n - i; j++) {
        System.out.print(" ");
      }
      int k = 1; // for number appearance and for starting number track
      for (int j = 1; j <= i; j++) {
        System.out.print(k + " ");
        k = k * (i - j) / (j); // calculate based on appearance of row according to element
      }
      System.out.println();
    }
  }
}
/* 
     1
    1 1
   1 2 1
  1 3 3 1 
*/
