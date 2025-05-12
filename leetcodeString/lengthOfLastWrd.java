package leetcodeString;

public class lengthOfLastWrd {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";  //s = "   fly me   to   the moon  "s = "Hello World"
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        int end = s.length() - 1;

        while(end >= 0 && s.charAt(end) == ' '){ // skip spaces at the last
            end--;
        }

        int start = end;
        while(start >= 0 && s.charAt(start) != ' '){
            start--;
        }
        return end - start;
    }
}
