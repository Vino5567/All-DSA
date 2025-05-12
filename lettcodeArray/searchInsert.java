package lettcodeArray;

public class searchInsert {
    public int searchInsert(int[] nums, int target) {
        if(nums.length == 0 && nums == null) return -1;
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;

        while(left <= right){
            mid = left + (right - left) / 2;
            if(nums[mid] <= target){
                left = mid + 1;
            }else if(nums[mid] >= target){
                right = mid - 1;
            }else if(nums[mid] == target){
                return mid - 1;
            }
        }
        return mid;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        searchInsert s = new searchInsert();
        int a = s.searchInsert(nums, target);
        System.out.println(a);
    }
}
