package stack;

import java.util.Arrays;
import java.util.Stack;

public class colliad {
    public static void main(String[] args) {
        int[] asteroids = {5, 10, -5}; // [8,-8] [10,2,-5]
        System.out.println(asteroidCollision(asteroids));
    }

    public static String asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int a : asteroids) {
            while (!stack.isEmpty() && a < 0 && stack.peek() > 0) {
                if (Math.abs(a) > stack.peek()) {
                    stack.pop();
                    continue;
                } else if (Math.abs(a) == stack.peek()) {
                    stack.pop();
                }
                a = 0;  // Both explode
            }
            if (a != 0) {
                stack.push(a);
            }
        }
        int[] result = new int[stack.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = stack.get(i); // Use stack.get(i) to avoid popping elements
        }

        return Arrays.toString(result);
//        return stack.stream().mapToInt(i -> i).toString();
    }
}
