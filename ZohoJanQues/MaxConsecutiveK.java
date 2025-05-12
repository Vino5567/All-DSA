package ZohoJanQues;

//Note: for sliding window for loop for expand while loop inside for loop for shirnk

public class MaxConsecutiveK {
    public static void main(String[] args) {
//        System.out.println(maxFlipsSubstring("TTFF", 2));  // Output: 3
        System.out.println(maxFlipsSubstring("TTFTFFT", 1));  // Output: 3
    }

        // Function to find the longest substring by changing at most 'k' characters
        public static int longestSubstring(String s, int k, char target) {
            int left = 0;
            int maxLen = 0;
            int flipCount = 0;

            for (int right = 0; right < s.length(); right++) {
                // If the current character isn't the target, flip it
                if (s.charAt(right) != target) {
                    flipCount++;
                }

                // If the number of flips exceeds k, shrink the window
                while (flipCount > k) {
                    if (s.charAt(left) != target) {
                        flipCount--;
                    }
                    left++;
                }

                // Calculate the maximum length of the window
                maxLen = Math.max(maxLen, right - left + 1);
            }

            return maxLen;
        }

        // Main function to find the maximum length of substring after flipping at most 'k' characters
        public static int maxFlipsSubstring(String s, int k) {
            // Maximize by converting 'T' to 'F' and vice versa
            return Math.max(longestSubstring(s, k, 'T'), longestSubstring(s, k, 'F'));
        }
}



