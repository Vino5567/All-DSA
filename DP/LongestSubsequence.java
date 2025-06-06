package DP;

public class LongestSubsequence {
    public static void main(String[] args) {
        int[] arr = {0,1,5,2,3,4}; // {0,1,0,3,2,3}
        int n = arr.length;
        int[] length = new int[n];
        int ans = 1;

        for (int i = 0; i < n; i++) {
            length[i] = 1;
        }

        for (int right = 1; right < n; right++) {// loop right till the end
            for (int left = 0; left < right; left++) { // loop left till the right
                if (arr[left] < arr[right]) { // check the given array wheather the right greater than left
                    length[right] = Math.max(length[right], length[left] + 1); // if true length[right] la length[right] perusa illa length[left] + 1 peurusa nu paathu pooodanu length [right] la
                }
            }
            ans = Math.max(ans, length[right]); // inner loop complete ana odana ans la length[right] athavuthu namma kandu puducha last value perusa illa nas perusa nu paathu pootranu
        }
        System.out.println(ans);
    }
}

