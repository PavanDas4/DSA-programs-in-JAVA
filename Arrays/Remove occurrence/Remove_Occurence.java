
/*
 * Remove Occurrence of an element from an array
 * Remove all duplicated elements from an array and return the new array with size
 * Example: Input: [1, 2, 2, 3, 4, 4] Output: [1, 2, 3, 4]
 */
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Remove_Occurence {
  public static int[] RemoveOccurrence(int[] arr) {
    Set<Integer> set = new HashSet<>(); // HashSet to store unique elements
    for (int i = 0; i < arr.length; i++) {
      if (!set.contains(arr[i])) { // Check if the element is not already in the set
        set.add(arr[i]); // Add the element to the set
      }
    }
    return set.stream().mapToInt(i -> i).toArray(); // Convert the set to an array
  }

  public static void main(String[] args) {
    System.out.print("Enter the size of the array: ");
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt(); // Size of the array
    System.out.print("Enter the elements of the array: ");
    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = scanner.nextInt(); // Input the elements
    }
    scanner.close();
    System.out.println("Removed duplicate element of array: " + Arrays.toString(RemoveOccurrence(arr)) + "\nSize of the array: " + RemoveOccurrence(arr).length);
  }
}
/*
 * Output:
 * Enter the size of the array: 6
 * Enter the elements of the array: 1 2 2 3 4 4
 * Removed duplicate element of array: [1, 2, 3, 4]
 * Size of the array: 4
 */