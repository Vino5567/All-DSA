package Practice;

import java.util.HashMap;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, maxLength = 0,len = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();

        while(j < n){
            if(map.containsKey(s.charAt(j)) && map.get(s.charAt(j)) >= i){
                i = map.get(s.charAt(j)) + 1; // note
            }

            len = j - i + 1;
            maxLength = Math.max(len, maxLength);

            map.put(s.charAt(j), j);
            j++;
        }
        return maxLength;
    }
}
