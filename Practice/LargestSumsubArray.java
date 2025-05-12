package Practice;

public class LargestSumsubArray {
    public static void main(String[] args) {
        int[] arr = {2,7,-5, 1, 3, 2, 9 ,-7};
        System.out.println(maxSubArray(arr));
    }
// this is like kadane's algo
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum > max) max = sum; // if sum is greater than max then replace max with sum
            if(sum < 0) sum = 0; // if sum is less than 0 then reset the sum to 0
        }
        return max;
    }
}
