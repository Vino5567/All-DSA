package lettcodeArray;

import java.util.Arrays;

public class closet3sum {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int closest_sum = Integer.MAX_VALUE / 2;  // A large value but not overflow

            for (int i = 0; i < nums.length - 2; ++i) {
                int left = i + 1, right = nums.length - 1;
                while (left < right) {
                    int current_sum = nums[i] + nums[left] + nums[right];
                    if (Math.abs(current_sum - target) < Math.abs(closest_sum - target)) {
                        closest_sum = current_sum;
                    }
                    if (current_sum < target) {
                        ++left;
                    } else if (current_sum > target) {
                        --right;
                    } else {
                        return current_sum;
                    }
                }
            }

            return closest_sum;
        }

    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        closet3sum c = new closet3sum();
        c.threeSumClosest(nums, 1);
    }


}
