package lettcodeArray;

import java.util.*;
public class removeDuplicates {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for(int i = 1; i < nums.length; i++){

            if(nums[i] == nums[i - 1]){
                nums[k++] = nums[i];

                i++;
                while(i < nums.length && nums[i] == nums[i - 1]) i++;
            }else{
                i++;
            }

        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 0, k+1)));
        return k;
}

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates rd = new removeDuplicates();
        rd.removeDuplicates(nums);
    }
}
