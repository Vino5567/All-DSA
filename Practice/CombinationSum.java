package Practice;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr = {8,3,4,7,9};
        int target = 7;
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0, arr, target, new ArrayList<>(), ans);
        System.out.println(ans);
    }

    private static void findCombination( int ind, int[] arr, int target, List<Integer> ds, List<List<Integer>> ans){
        if(ind == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if(arr[ind] <= target){
            ds.add(arr[ind]);
            findCombination(ind, arr, target - arr[ind], ds, ans);
            ds.remove(ds.size() - 1);
        }
        findCombination(ind + 1, arr, target, ds, ans);
    }
}
