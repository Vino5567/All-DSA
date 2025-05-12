package binarySearch;

public class peekElement {
    public static void main(String[] args) {
        //int[] nums = {1, 2, 3, 1}; //[1,2,1,3,5,6,4]  [1, 3, 2, 5, 4, 8, 6, 7, 6, 9, 5, 10, 8]
        int[] nums = {2,2,2,2,3,3,2,2,2,3,1};
                System.out.println(findPeakElement(nums));
    }

    public static int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > nums[mid + 1]){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}
