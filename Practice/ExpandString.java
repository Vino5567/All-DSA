package Practice;

import java.util.Stack;

public class ExpandString {
    public static void main(String[] args) {
        String input1 = "3[a]2[bc]";
        String input2 = "2[abc]3[cd]ef";

        System.out.println(expand(input1)); // Output: ZZ oho
        System.out.println(expand(input2)); // Output: xxyyyzxxyyyz
    }

    public static String expand(String s) {
        Stack<Integer> st = new Stack<>();
        Stack<StringBuilder> st1 = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                n = n * 10 + (c - '0');
            } else if (c == '[') {
                st.push(n);
                n = 0;
                st1.push(sb);
                sb = new StringBuilder();
            } else if (c == ']') {
                int k = st.pop();
                StringBuilder temp = sb;
                sb = st1.pop();
                while (k-- > 0) {
                    sb.append(temp);
                }
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}

