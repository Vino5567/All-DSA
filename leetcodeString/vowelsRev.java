package leetcodeString;

public class vowelsRev {
    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowels(s));

    }

    public static String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        String vowels = "aeiouAEIOU";

        while (start < end) {
            // Move start pointer until it points to a vowel
            while (start < end && vowels.indexOf(word[start]) == -1) {
                start++;
            }

            // Move end pointer until it points to a vowel
            while (start < end && vowels.indexOf(word[end]) == -1) {
                end--;
            }

            // Swap the vowels
            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;

            // Move the pointers towards each other
            start++;
            end--;
        }

        String answer = new String(word);
        return answer;
    }

//    public static String swap(String s, int left, int right){
//        StringBuilder sb = new StringBuilder(s);
//        char temp = sb.charAt(left);
//        sb.setCharAt(left, sb.charAt(right));
//        sb.setCharAt(right, temp);
//        return sb.toString();
//    }
//
//    public static String reverseVowels(String s) {
//        int left = 0, right = s.length() - 1;
//        while(left <= right){
//            if(s.charAt(left) != 'a' && s.charAt(left) != 'e' && s.charAt(left) != 'i' && s.charAt(left) != 'o' && s.charAt(left) != 'u' && s.charAt(left) != 'A' && s.charAt(left) != 'E' && s.charAt(left) != 'I' && s.charAt(left) != 'O' && s.charAt(left) != 'U'){
//                left++;
//            }else if(s.charAt(right) != 'a' && s.charAt(right) != 'e' && s.charAt(right) != 'i' && s.charAt(right) != 'o' && s.charAt(right) != 'u' && s.charAt(right) != 'A' && s.charAt(right) != 'E' && s.charAt(right) != 'I' && s.charAt(right) != 'O' && s.charAt(right) != 'U'){
//                right--;
//            }else{
//                s = swap(s, left, right);
//                left++;
//                right--;
//            }
//        }
//        return s;
//    }
}
