package slidingWindow;

public class maxConsecutiveOne {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}; // nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
        int k = 2;
        System.out.println(longestOnes(nums, k));
    }

    public static int longestOnes(int[] nums, int k) {
        int start = 0;
        int zero = 0;
        int max = 0;

        for(int end = 0; end < nums.length; end++){
            if(nums[end] == 0){
                zero++;
            }

            while(zero > k){
                if(nums[start] == 0){
                    zero--;
                }
                start++;
            }

            max = Math.max(max, end - start + 1);

        }

        return max;
    }
}
