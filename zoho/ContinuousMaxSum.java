package zoho;

public class ContinuousMaxSum {
    public static void main(String[] args) {
        int[] array = {0,5,6,0,9,0,1,4};
        System.out.println(maxSum(array));
    }

    public static int maxSum(int[] array){
        int max = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int sum = array[i] + array[i + 1];
            if(max < sum){
                max = sum;
            }
        }
        return max;
    }
}
