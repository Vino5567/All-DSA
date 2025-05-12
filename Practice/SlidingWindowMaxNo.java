package Practice;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMaxNo {
    public static void main(String[] args) {
        int[] q = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int n = q.length;

        int forAns = 0;
        int[] ans = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            if(!deque.isEmpty() && deque.peek() == i - k){ // remember i - k to remove more than k value in the front
                deque.poll();
            }

            while(!deque.isEmpty() && q[deque.peekLast()] < q[i]){ // here remove smaller element than the selected element
                deque.pollLast(); // and here take from last elementh in the que
            }

            deque.offer(i);
            if(i >= k - 1){ // check for k element
                ans[forAns++] = q[deque.peek()];
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
