package zoho;

public class FindNonRepeatedNo {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        int[] nums1 = {3,3,7,7,10,10,11,11,12};

        System.out.println(singleNonDuplicate(nums));
    }

    public static int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length-1;
        while(left < right){
            int mid = (left + right)/2;
            if( (mid % 2 == 0 && nums[mid] == nums[mid +1]) || (mid %2 == 1 && nums[mid] == nums[mid - 1]) )
                left = mid + 1;
            else
                right = mid;
        }
        return nums[left];
    }
}
