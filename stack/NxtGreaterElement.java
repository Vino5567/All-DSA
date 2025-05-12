package stack;

import java.util.Stack;

public class NxtGreaterElement {
    public static void main(String[] args) {
        int[] nums = {4,2,6,8,1};

        Stack<Integer> stack = new Stack<>();

        stack.push(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            while(!stack.isEmpty() && stack.peek() < nums[i]) {
                System.out.println(stack.pop() + "->" + nums[i]);
            }
                stack.push(nums[i]);
        }



    }
}
