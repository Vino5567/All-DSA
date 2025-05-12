package Practice;

public class ReverseIgnoreAmpersand {

        public static void main(String[] args) {
            String input = "a&b"; //"a&bcd&e&f"
            System.out.println(reverseIgnoreAmpersand(input));
        }

        public static String reverseIgnoreAmpersand(String str) {
            char[] arr = str.toCharArray();
            int left = 0, right = arr.length - 1;

            while (left < right) {
                // Skip '&' characters
                if (arr[left] == '&') {
                    left++;
                    continue;
                }
                if (arr[right] == '&') {
                    right--;
                    continue;
                }

                // Swap non-'&' characters
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
            return new String(arr);
        }


}
