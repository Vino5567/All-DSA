package leetcodeString;

public class EmailNumberSum {
    public static void main(String[] args) {
        String email = "vvino5567@gmail.com";
        System.out.println(sumNumbersInEmail(email));
    }

    public static int sumNumbersInEmail(String email) {
        int sum = 0;

        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);
            if (c >= '0' && c <= '9') {
                sum += c - '0';
            }
        }
        return sum;
    }
}
