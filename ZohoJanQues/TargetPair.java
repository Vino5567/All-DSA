package ZohoJanQues;

import java.util.*;

public class TargetPair {
    public static void main(String[] args) {
        int[] arr = {7,5,6,4,3,10};
        int t = 16;
        System.out.println(pair(arr, t));
    }

    public static String pair(int[] arr, int t){
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < arr.length; i++) {
            int find = t - arr[i];
            if(map.containsKey(find)){
                ans[0] = i;
                ans[1] = map.get(find);
            }else{
                map.put(arr[i], i);
            }
        }
        return Arrays.toString(ans);
    }
}
