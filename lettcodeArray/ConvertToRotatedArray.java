package lettcodeArray;

import java.util.Arrays;

public class ConvertToRotatedArray {
    public static void main(String[] args) {
//        int [] nums = {-1, -100, 3, 99};
//        int k = 2;
//        int [] nums = {1, 2, 3, 4, 5, 6, 7};
//        int k = 3;
        int [] nums = {-1};
        int k = 2;

        System.out.println(rotate(nums, k));
    }

    private static String rotate(int[] nums, int k) {
        k %= nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

        return Arrays.toString(nums);
    }

    private static void reverse(int[] arr, int left, int right) {

        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }


}
