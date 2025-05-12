package dynamicProgramming;

public class RobberHouseII {
    public static void main(String[] args) {
        int[] house = {1,2,3};
        System.out.println(rob(house));
    }

    public static int rob(int[] house) {
        int n = house.length;
        if (n == 0) return 0;
        if (n == 1) return house[0];

        // Compute the max for two cases:
        // 1. Rob houses from 0 to n-2
        // 2. Rob houses from 1 to n-1
        return Math.max(robLinear(house, 0, n - 2), robLinear(house, 1, n - 1));
    }

    private static int robLinear(int[] house, int start, int end) {
        int prev = 0, prev2 = 0;

        for (int i = start; i <= end; i++) {
            int pick = house[i] + prev2;
            int notPick = prev;
            int curr = Math.max(pick, notPick);
            prev2 = prev;
            prev = curr;
        }

        return prev;
    }
}



