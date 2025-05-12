package lettcodeArray;

import java.util.Arrays;

public class moveZero {

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        System.out.println(moveZeroes(nums));
    }

    public static void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public static String moveZeroes(int[] nums) {
        int left = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                swap(nums,left,i);
                left++;
            }
        }

        return Arrays.toString(nums);
    }
}
