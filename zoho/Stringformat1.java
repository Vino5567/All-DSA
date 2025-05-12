package zoho;

public class Stringformat1 {
    public static void main(String[] args) {
        String input = "april";  // Example input
        print1(input);
    }

    public static void print1(String input) {
        // Start from the last character and build the substring progressively
        StringBuilder sb = new StringBuilder();

        // Loop through the string from the end to the start
        for (int i = input.length() - 1; i >= 0; i--) {
            sb.insert(0, input.charAt(i)); // Insert character at the beginning
            System.out.println(sb);         // Print the current substring
        }
    }
}


