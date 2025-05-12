package ZohoLastYearQues;


public class dlt {

    public static int[] sumBinary(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int[] result = new int[2];
        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                arr[0] = left;
                arr[1] = right;
                System.out.print(left + " " + right);
                return result;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int[] result = sumBinary(arr, 9);
    }
}

