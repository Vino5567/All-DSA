package Practice;

public class Wildcard {
    public static void main(String[] args) {
        String s = "aa", p = "*";
        System.out.println(isMatch(s, p));
    }
    public static boolean isMatch(String text, String pattern) {
        int n1 = text.length();
        int n2 = pattern.length();
        boolean[][] dp = new boolean[n1 + 1][n2 + 1];

        dp[0][0] = true;

        // Handle the pattern for leading '*' characters
        for (int j = 1; j <= n2; j++) {
            if (pattern.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
        }

        // Fill the dp table
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (text.charAt(i - 1) == pattern.charAt(j - 1) || pattern.charAt(j - 1) == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pattern.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                } else {
                    dp[i][j] = false;
                }
            }
        }

        return dp[n1][n2];
    }
}
