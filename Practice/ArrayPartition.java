package Practice;

import java.util.Arrays;

public class ArrayPartition {
    public static void main(String[] args) {
        int[] arr = {6,2,6,5,1,2}; //1,4,3,2
        System.out.println(arrayPairSum(arr));
    }

        public static int arrayPairSum(int[] nums) {
            Arrays.sort(nums);
            int n = nums.length;
            int ans = 0;
            for(int i = 0; i < n; i += 2)
                ans += nums[i];
            return ans;
        }

}
