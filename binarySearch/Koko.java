package binarySearch;

public class Koko {
    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11}; // [30,11,23,4,20], h = 6   [30,11,23,4,20], h = 5
        int h = 8;
        System.out.println(minEatingSpeed(piles, h));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 1000000000;

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(canEatInTime(piles, mid, h)) right = mid - 1;
            else left = mid + 1;
        }
        return left;
    }
    public static boolean canEatInTime(int piles[], int k, int h){
        int hours = 0;
        for(int pile : piles){
            int div = pile / k;
            hours += div;
            if(pile % k != 0) hours++;
        }
        return hours <= h;
    }

//    public boolean canEatInTime(int piles[], int speed, int h){
//        int ans = 0;
//        for(int pile: piles) {
//            ans += ((pile-1)/speed) + 1;
//            if(ans > h) return false;
//        }
//        return true;
//    }
//    public int minEatingSpeed(int[] piles, int h) {
//        int left = 1;
//        int maxVal = 0;
//        for(int pile: piles) {
//            maxVal = Math.max(maxVal, pile);
//        }
//        int right = maxVal;
//        int ans = maxVal;
//        while(left <= right){
//            int mid = left + (right - left) / 2;
//            if(canEatInTime(piles, mid, h)) {
//                ans = mid;
//                right = mid - 1;
//            }
//            else left = mid + 1;
//        }
//        return ans;
//    }
}
