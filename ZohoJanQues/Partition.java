package ZohoJanQues;

public class Partition {
    public static void main(String[] args) {
        int[] arr = {10, 10, 2, 3, 5};
        System.out.println(check(arr));
    }
    public static boolean check(int[] arr){
        int leftSum = 0;
        int rightSum = 0;
        boolean ans = false;
        int n = arr.length;
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += arr[i];
        }

        for (int i = 0; i < n; i++) {
            leftSum += arr[i];
            rightSum = total - leftSum;
            if( Math.abs(leftSum - rightSum) % 2 == 0){
                ans = true;
            }else{
                ans = false;
            }
        }
        return ans;
    }



}


















//    public static boolean check(int[] arr){
//        int leftSum = 0;
//        boolean ans = false;
//        for (int i = 0; i < arr.length - 1; i++) {
//            leftSum += arr[i];
//            int rightSum = 0;
//            for (int j = i + 1; j < arr.length; j++) {
//                rightSum += arr[j];
//            }
//            if( (Math.abs(leftSum - rightSum)) % 2 == 0){
//                ans = true;
//            }else{
//                ans = false;
//            }
//        }
//        return ans;
//    }
//}
