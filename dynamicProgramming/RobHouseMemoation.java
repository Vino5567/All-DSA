package dynamicProgramming;

public class RobHouseMemoation {
    public static void main(String[] args) {
        int[] house = {1, 2, 3, 1}; //2,7,9,3,1
        int[] dp = new int[house.length];
        System.out.println(rob(house.length - 1, house, dp));
    }

    public static int rob(int ind, int[] house, int[] dp) {
        if (ind == 0) {
            return house[ind];
        }
        if (ind < 0) {
            return 0;
        }

        if (dp[ind] != 0) {
            return dp[ind];
        }
        int pick = house[ind] + rob(ind - 2, house, dp);
        int notPick = 0 + rob(ind - 1, house, dp);

        dp[ind] = Math.max(pick, notPick);

        return dp[ind];
    }
}
