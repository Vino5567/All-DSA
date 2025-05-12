package leetcodeString;

public class commonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"}; // strs = ["dog","racecar","car"]
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String s1 = strs[0];
        int s1len = s1.length();

        for (int i = 1; i < strs.length; i++) {
            String s = strs[i];
            while (s1len > s.length() || !s1.equals(s.substring(0, s1len))) {
                s1len--;
                if (s1len == 0) {
                    return "";
                }
                s1 = s1.substring(0, s1len);
            }
        }
        return s1;
    }
}
