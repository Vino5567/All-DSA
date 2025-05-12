package zoho;

public class GapSum {

    public static void gap(int[] arr, int gap, int count){
        for (int i = 0; i < count; i++) {

            int sum = 0;
            for (int j = i; j < arr.length; j += gap) {
                sum += arr[j];
            }
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int gap = 4;
        int count = 3;
        gap(arr, gap, count);
    }
}
