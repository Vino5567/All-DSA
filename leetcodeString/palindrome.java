package leetcodeString;

public class palindrome {
    public static void main(String[] args) {
        String s = "racecar"; //"A man, a plan, a canal: Panama", "r a,  c'e c   a r"
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");// ^ - this means not a-z and 0-9
        System.out.println(palin(s));
    }

    public static boolean palin(String s){
        int left = 0, right = s.length() - 1;
        while(left <= right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
            if(s.charAt(right) == ' '){
                right--;
            }
            if(s.charAt(left) == ' '){
                left++;
            }
        }
        return true;
    }

}
