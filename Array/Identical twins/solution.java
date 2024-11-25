
// Identical twins
import java.util.Scanner;

public class solution {
  public static int twins(int[] arr) {
    int twins = 0; // intiicalize counter
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) { // check if elements are equal
          twins++; // increment counter
        }
      }
    }
    return twins;
  }

  public static int[] input(int n) {
    int[] arr = new int[n]; // initialize array
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the elements of the array: ");
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt(); // input elements
    }
    scanner.close();
    return arr; // return array
  }

  public static void main(String[] args) {
    System.out.print("Enter the number of elements in the array: ");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt(); // input Array size
    int[] arr = input(n);
    scanner.close();
    System.out.println("Number of twins: " + twins(arr));
  }
}