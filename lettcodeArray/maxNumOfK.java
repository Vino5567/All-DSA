package lettcodeArray;

import java.util.Arrays;

public class maxNumOfK {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4}; // {4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4}
        int k = 5;
        System.out.println(maxOperations(nums, k));
    }

        public static int maxOperations(int[] nums, int k) {
            Arrays.sort(nums);
            int ptr1 = 0, ptr2 = nums.length - 1, count = 0;

            while(ptr1 < ptr2){
                int sum = nums[ptr1] + nums[ptr2];
                if(sum == k){
                    count++;
                    ptr1++;
                    ptr2--;
                }
                else if(sum < k) ptr1++;
                else ptr2--;
            }
            return count;
        }

}
