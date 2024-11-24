// Merge Sorted Arrays
public class solution {
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0; // i for arr1, j for arr2
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) { // sort in ascending order
                result[k++] = arr1[i++]; // add to result
            } else {
                result[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) { // add the remaining elements
            result[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 2, 5, 5, 7 };
        int[] arr2 = { 2, 4, 6, 8 };
        int[] result = merge(arr1, arr2);
        System.out.println(java.util.Arrays.toString(result));
    }
}