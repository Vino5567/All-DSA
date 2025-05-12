package zoho;

public class Anagram {

    public static boolean isAnagram(String s1,String s2){
        if( s1.length() != s2.length()) return false;

        int[] check = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            check[s1.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < s2.length(); i++) {
            if(check[s1.charAt(i) - 'a'] <= 0){
                return false;
            }else{
                check[s1.charAt(i) - 'a'] -= 1;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "agentleman";
        String s2 = "elegantman";
        System.out.println("Given String is Anagram:" + isAnagram(s1, s2));
    }
}
