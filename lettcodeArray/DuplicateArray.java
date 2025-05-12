package lettcodeArray;

import java.util.Arrays;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,1,2,3,3};
        removeElement(arr);
    }

    private static void removeElement(int[] arr) {
        int k = 2;

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] != arr[k - 2]) {
                arr[k] = arr[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
