package KnowRecursion.sorting;

import java.util.Arrays;

public class SealectionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,9,1};
        sort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr, int row, int col, int maxc){
        if(row == 0){
            return;
        }

        if(col < row){
            if(arr[col] > arr[maxc]){
                sort(arr, row, col + 1, col);
            }else{
                sort(arr, row, col + 1, maxc);
            }
        }else{
            int temp = arr[maxc];
            arr[maxc] = arr[row - 1];
            arr[row - 1] = temp;
            sort(arr, row - 1, 0, 0);
        }
    }
}
