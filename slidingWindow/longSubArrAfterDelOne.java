package slidingWindow;

public class longSubArrAfterDelOne {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1}; //[1,1,1] ,[0,1,1,1,0,1,1,0,1]
        System.out.println(longestSubarray(nums));
    }

    public static int longestSubarray(int[] nums) {
        int start = 0;
        int max = 0;
        int zero = 0;

        for(int end = 0; end < nums.length; end++){
            if(nums[end] == 0){
                zero++;
            }
            while(zero > 1){
                if(nums[start] == 0){
                    zero--;
                }
                start++;
            }
            max = Math.max(max, end - start);
        }
        return max;
    }
}
