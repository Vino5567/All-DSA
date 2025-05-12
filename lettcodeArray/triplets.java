package lettcodeArray;

public class triplets {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1}; // [2,1,5,0,4,6]
        System.out.println(increasingTriplet(nums));
    }

    public static boolean increasingTriplet(int[] nums) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int n : nums) {
            if(n <= min1) min1 = n;
            else if(n <= min2) min2 = n;
            else return true;
        }
        return false;
    }
}
