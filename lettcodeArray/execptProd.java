package lettcodeArray;

import java.util.Arrays;

public class execptProd {
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3}; //nums = [1,2,3,4]

        System.out.println(productExceptSelf(nums));
    }

    public static String productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            output[i] = 1;
        }

        int left = 1;
        for (int i = 0; i < nums.length; i++) {
            output[i] *= left;
            left *= nums[i];
        }

        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] *= right;
            right *= nums[i];
        }

        return Arrays.toString(output);
    }
}
