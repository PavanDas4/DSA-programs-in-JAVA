import java.util.Arrays;

public class solution {
  public static void nextPermutation(int[] arr) {
    int pivot = -1;
    for (int i = arr.length - 2; i >= 0; i--) {
      if (arr[i] < arr[i + 1]) {
        pivot = i;
        break;
      }
    }
    if (pivot == -1) {
      Arrays.sort(arr);
    } else {
      int j = arr.length - 1;
      while (arr[pivot] >= arr[j]) {
        j--;
      }
      int temp = arr[pivot];
      arr[pivot] = arr[j];
      arr[j] = temp;
    }
    Arrays.sort(arr, pivot + 1, arr.length);
  }

  public static void main(String[] args) {
    int arr[] = { 3, 1, 5, 1 };
    nextPermutation(arr);
    System.out.println(Arrays.toString(arr));
  }
}