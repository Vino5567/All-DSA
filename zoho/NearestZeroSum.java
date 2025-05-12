package zoho;

import java.util.Arrays;
//it has some issue

public class NearestZeroSum {
    public static void main(String[] args) {
        int[] arr = {-8 -66 -60};
        int n = 3;
        System.out.println(closestToZero(arr, n));
    }
    public static int closestToZero (int arr[], int n)
    {
        Arrays.sort(arr);

        //Initialize two pointers one at the start and one at the end
        int left = 0;
        int right = n - 1; //right starts at the last element

        int closestSum = Integer.MAX_VALUE;

        //Loop to check all possible pairs
        while (left < right) {
            int sum = arr[left] + arr[right]; //Add two numbers

            //If the sum is closer to zero update closestSum
            //Math.abs() gives the absolute value of the sum so compare distances from zero
            if (Math.abs(sum) < Math.abs(closestSum) ||
                    (Math.abs(sum) == Math.abs(closestSum) && sum > closestSum)) {
                closestSum = sum; //Update if it's  sum
            }

            //If sum is -ve move left pointer right(to increase sum)
            if (sum < 0) {
                left++;
            }
            //If sum is +ve move the right pointer left(to decrease sum)
            else {
                right--;
            }
        }

        //Return the closest sum we found
        return closestSum;
    }

}
