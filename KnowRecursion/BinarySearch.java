package KnowRecursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,5,8,12,55,66,78,95};
        int target = 5;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    private static int search(int[] arr, int target, int left, int right) { //don't overthink left and right should be in arguments
        //base condition
        if(left > right){
            return - 1;
        }

        int m = left + (right - left)/2; // think this is need to be done in inside
        if(arr[m] == target){
            return m;
        }else if(arr[m] < target){
            return search(arr, target, m + 1, right); // return here is must, to get the answer
        }
        return search(arr, target, left, m - 1);
    }
}
