package Practice;

import java.util.HashSet;

public class LongestcontinuousRange {
    public static void main(String[] args) {
        int[] arr = {1,3,10,7,9,2,4,6};
        int n = 8;
        System.out.println(findContinuous(arr, n));

    }
    private static int findContinuous(int[] arr, int n){
        HashSet<Integer> set = new HashSet<>();
        int max = 0;

        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            if(!set.contains(arr[i] - 1)){
                int length = 1;
                while(set.contains(arr[i] + length)){
                    length++;
                }
                max = Math.max(max, length);
            }
        }
        return max;
    }
}
