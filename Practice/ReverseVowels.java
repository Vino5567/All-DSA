package Practice;

public class ReverseVowels{
    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowels(s));
    }
    public static  String reverseVowels(String s) {
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
}
