package zohoMdu;

import java.util.*;

public class LeaderSum {
    public static void findLeaderSum(int[] arr) {
        int n = arr.length;
        int maxRight = arr[n - 1]; // Rightmost element is always a leader

        System.out.println("Leaders: " + maxRight); // Printing leaders

        // Traverse the array from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxRight) {
                maxRight = arr[i];
                System.out.println("Leaders: " + maxRight);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {89,79,69,59,49};
        findLeaderSum(arr);
    }
}

