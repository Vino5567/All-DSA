package Practice;

public class ThresholdValue {
    public static void main(String[] args) {
        int[] arr = {5,8,10,13,6,2};
        int value = 3;
        System.out.println(find(arr, value ));
    }

    public static int find(int[] arr, int threshold){
        int count = 0;

        for (int i : arr) {
            int div = i / threshold;
            int mod = i % threshold;
            count += div;
            if(mod != 0){
                count += 1;
            }
        }
        return count;
    }
}
