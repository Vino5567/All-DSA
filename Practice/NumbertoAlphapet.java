package Practice;

public class NumbertoAlphapet {
    public static void main(String[] args) {
        String s = "11112";
        combinations2("", s, 0, 5);
    }
    static void combinations2(String p, String up, int index, int length) {
        if (index == length) {
            System.out.println(p);
            return;
        }
        int sum = 0;
        for (int i = index; i < length; i++) {
            int digit = up.charAt(i) - '0';
            sum = sum * 10 + digit;
            if (sum > 0 && sum < 26) {
                char s = (char) ('A' + (sum - 1));
                combinations2(p + s, up, i + 1, length);
            }
        }
    }
}
