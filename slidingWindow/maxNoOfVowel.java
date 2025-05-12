package slidingWindow;

public class maxNoOfVowel {
    public static void main(String[] args) {
        String s = "leetcode"; //s = "leetcode", k = 3   s = "aeiou", k = 2
        int k = 3;
        System.out.println(maxVowels(s, k));
    }
    public static boolean isVowel(char c){
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

    public static int maxVowels(String s, int k) {
        int ans = 0;
        int max = 0;

        for(int i = 0; i < k; i++){
            if(isVowel(s.charAt(i))) max++;
        }

        ans = max;

        for(int i = k; i < s.length(); i++){
            if(isVowel(s.charAt(i))) max++;
            if(isVowel(s.charAt(i - k)))max--;

            if(max > ans) ans = max;
        }

        return ans;
    }
}


