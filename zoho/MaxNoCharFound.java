package zoho;

public class MaxNoCharFound {
    public static void main(String[] args) {
        String s1 = "babcddc"; //2 char present between c
        String s2 = "abbacdfgcesdfeemn"; //4 char s,d,e,f present between e
        String s3 = "absdjsfhkba" ;
        maxChar(s3);
    }

    private static void maxChar(String s1) {
        int maxLength = 0;
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j < s1.length(); j++) {
                if(s1.charAt(i) == s1.charAt(j)){
                    if(maxLength < s1.substring(i + 1 , j).length()){
                        maxLength = s1.substring(i + 1 , j).length();
                        i = j - 1; // Note here // inner length is lower than the outer length
                        break;
                    }
                }
            }
        }
        System.out.println(maxLength);
    }


}
 /*
 optimized version

 package zoho;

import java.util.HashMap;

public class MaxNoCharFound {
    public static void main(String[] args) {
        String s1 = "babcddc"; // 2 chars present between 'c'
        String s2 = "abbacdfgcesdfeemn"; // 4 chars 's', 'd', 'e', 'f' present between 'e'
        String s3 = "absdjsfhkba";
        maxChar(s3);  // Call the method
    }

    private static void maxChar(String s1) {
        HashMap<Character, Integer> lastOccurrence = new HashMap<>();
        int maxLength = 0;

        // Iterate over the string
        for (int i = 0; i < s1.length(); i++) {
            char currentChar = s1.charAt(i);

            // If the character has been seen before, calculate the distance
            if (lastOccurrence.containsKey(currentChar)) {
                int prevIndex = lastOccurrence.get(currentChar);
                // Calculate length of the substring between previous occurrence and current character
                maxLength = Math.max(maxLength, i - prevIndex - 1);
            }

            // Update the last occurrence of the character
            lastOccurrence.put(currentChar, i);
        }

        // Print the result
        System.out.println(maxLength);
    }
}

  */