package Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class MinimumOfGreaterNumber {
    static void smallestGreater(int arr[], int n) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int[] copy = new int[n];

        for (int i = 0; i < n; i++) {
            copy[i] = arr[i];
        }
        Arrays.sort(copy);

        for (int i = 0; i < n - 1; i++) {
            map.put(copy[i], copy[i + 1]);
        }
        map.put(copy[n - 1], -1); // note because null value in map returns error

        for (int i = 0; i < n; i++) {
            arr[i] = map.get(arr[i]);
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args){
        int ar[] = {6, 3, 9, 8, 10, 2, 1, 15, 7};
        int n = ar.length;
        smallestGreater(ar, n);
    }
}
