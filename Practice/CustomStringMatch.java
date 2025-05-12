package Practice;

public class CustomStringMatch {
    public static void main(String[] args) {
        System.out.println(isMatch("Spoon", "Span"));       // false
        System.out.println(isMatch("Zoh", "*o*o"));        // true
        System.out.println(isMatch("Man", "*"));           // true
        System.out.println(isMatch("Subline", "*line"));   // true
    }

    private static boolean isMatch(String text, String pattern) {
        return matchHelper(text, 0, pattern, 0);
    }

    private static boolean matchHelper(String text, int i, String pattern, int j) {
        // If both text and pattern are completely checked, return true
        if (i == text.length() && j == pattern.length()) {
            return true;
        }

        // If only the pattern is exhausted, return false
        if (j == pattern.length()) {
            return false;
        }

        // If text is exhausted but pattern has remaining '*', check further
        if (i == text.length()) {
            return pattern.charAt(j) == '*' && matchHelper(text, i, pattern, j + 1);
        }

        // If pattern has '*', it can match 0 or more characters
        if (pattern.charAt(j) == '*') {
            return matchHelper(text, i + 1, pattern, j) || matchHelper(text, i, pattern, j + 1);
        }

        // If characters match, move to the next character
        if (text.charAt(i) == pattern.charAt(j)) {
            return matchHelper(text, i + 1, pattern, j + 1);
        }

        // No match found
        return false;
    }
}

