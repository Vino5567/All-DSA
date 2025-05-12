package Practice;

public class RemoveInsertTOForm {
        static int lcs(String s1, String s2) {
            int m = s1.length();
            int n = s2.length();

            int[][] dp = new int[2][n + 1];

            for (int i = 0; i <= m; i++) {
                int curr = i % 2;
                for (int j = 0; j <= n; j++) {
                    if (i == 0 || j == 0)
                        dp[curr][j] = 0;
                    else if (s1.charAt(i - 1) == s2.charAt(j - 1))
                        dp[curr][j] = dp[1 - curr][j - 1] + 1;
                    else
                        dp[curr][j] = Math.max(dp[1 - curr][j], dp[curr][j - 1]);
                }
            }
            return dp[m % 2][n];
        }

        static int minOperations(String s1, String s2) {
            int m = s1.length();
            int n = s2.length();
            int len = lcs(s1, s2); //Longest common subsequence
            int minDeletions = m - len;
            int minInsertions = n - len;
            return minDeletions + minInsertions;
        }

        public static void main(String[] args) {
//            String s1 = "AGGTAB";
//            String s2 = "GXTXAYB";
            String s1 = "heap";
            String s2 = "pea";
            int res = minOperations(s1, s2);
            System.out.println(res);
        }


}

