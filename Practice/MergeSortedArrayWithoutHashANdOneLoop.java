package Practice;

import java.util.Arrays;

public class MergeSortedArrayWithoutHashANdOneLoop {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 3, 5, 7};

        int[] mergedArray = mergeSortedArrays(arr1, arr2);

        // Print the output array
        System.out.println(Arrays.toString(mergedArray));
    }

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        int[] result = new int[n1 + n2]; // Max possible size
        int i = 0, j = 0, k = 0;

        while (i < n1 || j < n2) { // **Single loop**
            int val1 = (i < n1) ? arr1[i] : Integer.MAX_VALUE;
            int val2 = (j < n2) ? arr2[j] : Integer.MAX_VALUE;

            if (val1 < val2) {
                if (k == 0 || result[k - 1] != val1) { // Avoid duplicates
                    result[k++] = val1;
                }
                i++;
            } else {
                if (k == 0 || result[k - 1] != val2) { // Avoid duplicates
                    result[k++] = val2;
                }
                j++;
            }
        }

        // Trim the result array to remove extra zeros
        return Arrays.copyOf(result, k);
    }
}
