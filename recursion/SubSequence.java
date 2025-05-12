package recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSequence {
    public static void main(String[] args) {
        int[] nums = {3,1,2};
        List<Integer> list = new ArrayList<>();
        recursive(0,nums, list);
    }

    public static void recursive(int n, int[] nums , List<Integer> list){
        if(n == nums.length){
            System.out.println(list);
            return;
        }
        list.add(nums[n]);
        recursive(n + 1, nums, list);
        list.remove(list.size() - 1);
        recursive(n + 1, nums, list);
    }
}
