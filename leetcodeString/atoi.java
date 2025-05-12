package leetcodeString;

public class atoi {
    public static void main(String[] args) {
        String str = "32"; //" -042", "words and 987", "0-1", "1337c0d3"
        System.out.println(myAtoi(str));
    }
    public static int myAtoi(String s) {
        int INT_MAX = 2147483647, INT_MIN = -2147483648;
        int i = 0, n = s.length(), sign = 1, result = 0;

        // Step 1: Skip leading whitespace
        while (i < n && s.charAt(i) == ' ') i++;

        // Step 2: Check for optional sign
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }

        // Step 3: Convert digits to integer
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            // Check for overflow
            if (result > (INT_MAX - digit) / 10) {
                return sign == 1 ? INT_MAX : INT_MIN;
            }
            result = result * 10 + digit;
            i++;
        }

        return sign * result;
    }
}
