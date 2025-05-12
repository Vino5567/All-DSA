package slidingWindow;

public class maxAvgSubArr {
    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3}; //nums = [5], k = 1
        int k = 4;
        System.out.println(maxAvg(nums, k));
    }

    public static double maxAvg(int[] nums, int k){
        double max = 0;
        double sum = 0;
        int i;

        for(i = 0; i < k; i++){
            sum += nums[i];
        }
        max = sum/k;

        while(i < nums.length){
            sum += nums[i] - nums[i-k];
            if(max < sum/k){
                max = sum/k;
            }
            i++;
        }
        return max;
    }
}
