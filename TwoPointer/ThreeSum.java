package TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(summ(nums));
    }

    public static ArrayList<List<Integer>> summ(int[] arr) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {
                if (arr[i] + arr[j] + arr[k] == 0) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(arr[k]);
                    ans.add(list);
                    k--;
                    j++;
                    while (arr[k] == arr[k + 1]) k--;
                    while (arr[j] == arr[j - 1]) j++;
                } else if (arr[i] + arr[j] + arr[k] < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return ans;
    }
}
