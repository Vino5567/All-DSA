package binarySearch;
import java.util.*;

public class PairsOfSpell {
    public static void main(String[] args) {
        int[] spells = {5, 1, 3}, potions = {1, 2, 3, 4, 5};
        int success = 7;
        System.out.println(successfulPairs(spells, potions, success));
    }

    public static String successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        int[] result = new int[n];
        Arrays.sort(potions);

        for(int i = 0; i < n; i++){
            int left = 0;
            int right = m - 1;
            while(left <= right){
                int mid = left + (right - left)/2;
                long product = (long) spells[i] * potions[mid];
                if(product >= success){
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            }
            result[i] = m - left;

        }
        return Arrays.toString(result);
    }
}
