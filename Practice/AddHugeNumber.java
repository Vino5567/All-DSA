package Practice;

public class AddHugeNumber {
    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 9;
        int[] arr1 = {9,2,8,1,3,5,6,7,3,1,1,6};
        int[] arr2 = {7,8,4,6,2,1,9,9,7};
        System.out.println(add(arr1, n1, arr2, n2));
    }

    public static long add(int[] arr1, int n1, int[] arr2, int n2){
        long sum1 = 0;
        long sum2 = 0;
        for (int i = 0; i < n1; i++) {
            sum1 = sum1 * 10 + arr1[i]; // note this formula
        }
        for (int i = 0; i < n2; i++) {
            sum2 = sum2 * 10 + arr2[i];
        }
        return sum1+sum2;
    }
}
