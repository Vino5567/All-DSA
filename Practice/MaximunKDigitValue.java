package Practice;

import java.util.ArrayList;

public class MaximunKDigitValue {
    public static void main(String[] args) {
        int[] arr = {1, 23, 456, 789, 45, 6789, 123, 678, 900};
        int k = 3;
        System.out.println(find(arr,k));
    }

    private static int find(int[] arr, int k){
        ArrayList<Integer> list = new ArrayList<>();
        int max = 0;

        for (int num : arr){
            if(num > 99 && num < 1000){
                max = Math.max(max, num);
            }
        }


        return max;
    }
}
