package dynamicProgramming;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(climb(n));
    }
    public static int climb(int n){
        int prev = 1;
        int prev2 = 1;
        int cur = 0;

        for (int i = 1; i < n; i++) {
            cur = prev + prev2;
            prev2 = prev;
            prev = cur;
        }
        return cur;
    }
}
