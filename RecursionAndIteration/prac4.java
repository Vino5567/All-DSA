package RecursionAndIteration;

import java.util.ArrayList;
import java.util.List;

public class prac4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<List<Integer>> ans = test(arr);
        System.out.println(ans);
    }

    static ArrayList<List<Integer>> test (int[] arr){

        ArrayList<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int i = 0; i < arr.length; i++ ){
            int n = outer.size();

            for(int j = 0; j < n; j++){
                ArrayList<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }

}
