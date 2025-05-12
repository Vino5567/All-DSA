package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,6,9};
        int[] arr2 = {2,4,5,10};

        int left = 0, right = 0, a = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(left != arr1.length && right != arr2.length){
            if(arr1[left] < arr2[right]){
                ans.add(arr1[left++]);
            } else if (arr1[left] == arr2[right]) {
                ans.add(arr1[left]);
                left++;
                right++;
            }else{
                ans.add(arr2[right++]);
            }
        }

        while(left != arr1.length){
            ans.add(arr1[left++]);
        }

        while(right != arr2.length){
            ans.add(arr2[right++]);
        }
        System.out.println(ans);
    }
}
