package KnowRecursion.string;

import java.util.ArrayList;
import java.util.List;

public class Iteration {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = iteration(arr);
        System.out.println(ans);
    }

    public static List<List<Integer>> iteration(int[] arr){
        ArrayList<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num : arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;

    }
}
