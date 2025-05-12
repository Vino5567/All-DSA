package leetcodeString;

public class isSubSequence {
    public static void main(String[] args) {
        String s = "aaaaaa", t = "bbaaaa"; //s = "axc", t = "ahbgdc"  s = "abc", t = "ahbgdc"
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        int left = 0;
        int right = 0;

        while(left < s.length() && right < t.length()){
            if(s.charAt(left) == t.charAt(right)){
                left++;
            }
            right++;
        }
        return left == s.length();
    }

//    public static boolean isSubsequence(String s, String t) {
//        int left = 0;
//        int right = 0;
//        int count = 0;
//
//        while(left < s.length()){
//            while(right < t.length()){
//                if(s.charAt(left) == t.charAt(right)){
//                    count++;
//                    break;
//                }else{
//                    right++;
//                }
//            }
//            left++;
//
//        }
//        if(count == s.length()){
//            return true;
//        }else{
//            return false;
//        }
//    }
}
