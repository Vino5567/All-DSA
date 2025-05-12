package lettcodeArray;

public class fndPivotInd {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6}; //[2,1,-1]  [1,2,3]
        System.out.println(pivotIndex(nums));
    }
    public static int pivotIndex(int[] nums) {
        int total = 0;
        int ltotal = 0;
        int rtotal = 0;

        for(int num : nums){
            total += num;
        }

        for(int i = 0; i < nums.length; i++){
            rtotal = total - ltotal - nums[i];
            if(ltotal == rtotal){
                return i;
            }
            ltotal += nums[i];
        }
        return -1;

    }
}
