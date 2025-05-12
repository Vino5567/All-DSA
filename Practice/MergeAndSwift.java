package Practice;

import java.util.Arrays;

public class MergeAndSwift {
    public static void main(String[] args) {
        int[] arr = {0, 2, 2, 2, 0, 6, 6, 0, 8};

        // Process the array
        processArray(arr);

        // Print the output
        System.out.println(Arrays.toString(arr));
    }

    public static void processArray(int[] arr) {
        int n = arr.length;

        // Step 1: Merge adjacent duplicates
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != 0 && arr[i] == arr[i + 1]) {
                arr[i] *= 2;  // Double the current number
                arr[i + 1] = 0;  // Set the next index to 0
            }
        }

        // Step 2: Move all non-zero elements to the left
        int index = 0;  // Position to place non-zero elements
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        // Step 3: Fill the remaining positions with zeros
        while (index < n) {
            arr[index++] = 0;
        }
    }
}