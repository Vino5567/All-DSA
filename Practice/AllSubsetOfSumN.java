package Practice;
import java.util.List;
import java.util.ArrayList;

public class AllSubsetOfSumN {
    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 4, 5};
        int n = 6;
        subset(0, arr, n, new ArrayList<>());
        }
    private static void subset(int ind, int[] arr, int n, List<Integer> list){
        if(ind == arr.length){
            if(n == 0) {
                System.out.println(list);
            }
            return;
        }

        list.add(arr[ind]);
        subset(ind + 1, arr, n - arr[ind], list);
        list.remove(list.size() - 1);

        subset(ind + 1, arr, n, list);

    }

}


