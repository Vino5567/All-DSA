package zoho;

import java.util.Arrays;

public class RearrangeArray {

    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void rearrange(int[] arr){
        Arrays.sort(arr); //10,20,30,40,50,60,70
        for (int i = 1; i < arr.length - 1; i += 2) {

            swap(arr, i, i - 1);

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {50,60,10,20,30,40,70};
        rearrange(arr);
    }
}
