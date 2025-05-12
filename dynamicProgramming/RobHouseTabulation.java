package dynamicProgramming;

public class RobHouseTabulation {
    public static void main(String[] args) {
        int[] house = {1,2,3,1}; //2,7,9,3,1
        int n  = house.length;

        int dp1 = house[0];
        int dp2 = 0;

        for (int i = 1; i < n; i++) {
            int take = house[i];
            if(i > 1){
                 take += dp2;
            }

            int notTake = 0 + dp1;

            int ans = Math.max(take, notTake);
            dp2 = dp1;
            dp1 = ans;

        }
        System.out.println(dp1);
    }
}

