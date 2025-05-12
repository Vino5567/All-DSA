package dynamicProgramming;

import static java.lang.Math.abs;

public class FrogJumpWithK {
    public static void main(String[] args) {
        int[] energy = {10, 5, 20, 0, 15};
        int k = 2;
        int[] dp = new int[energy.length];
        System.out.println(jump(energy.length - 1, k, energy, dp));
    }

    public static int jump(int ind, int k, int[] energy, int[] dp) {
        if (ind == 0) {
            return 0;
        }
        if(dp[ind] != 0 ) return dp[ind];
        int minStep = Integer.MAX_VALUE;
        for (int i = 1; i <= k; i++) {
            if (ind - i >= 0) {
                int jum = jump(ind - i, k, energy, dp) + abs(energy[ind] - energy[ind - i]);
                minStep = Math.min(minStep, jum);
                dp[ind] = minStep;
            }
        }
        return minStep;
    }
}
