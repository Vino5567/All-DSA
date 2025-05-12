package Practice;

import java.util.ArrayList;
import java.util.List;

public class RemovePalin {

    // Function to return a list of words that are not palindromes
    public static List<String> removePalindrome(String string) {
        // Split the string into individual words using space as a separator
        String[] words = string.split(" ");

        // Create a new list to store words that are not palindromes
        List<String> newList = new ArrayList<>();

        // Iterate over all words in the input string
        for (String word : words) {
            // If the word is not a palindrome, add it to the new list
            if (!isPalindrome(word)) {
                newList.add(word);
            }
        }

        // Return the list of words that are not palindromes
        return newList;
    }

    // Function to check if a word is a palindrome or not
    public static boolean isPalindrome(String word) {
        int left = 0, right = word.length() - 1;

        // Check if the word is a palindrome
        while (left < right) {
            // If characters at left and right pointers are not equal, return false
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        // If the loop completes, the word is a palindrome
        return true;
    }

    // Main function to execute the program
    public static void main(String[] args) {
        // Input string
        String string = "Text contains malayalam and level words";

        // Call the removePalindrome function and print the result
        System.out.println(removePalindrome(string));
    }
}
