package leetcodeString;

public class strOccur {
    public static void main(String[] args) {
        String haystack = "sadbutsad", needle = "sad"; //haystack = "leetcode", needle = "leeto"  haystack = "hello", needle = "ll"
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }

        int nlen = needle.length();

        for(int i = 0; i <= haystack.length() - nlen; i++){

            if(haystack.substring(i, i + nlen).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
