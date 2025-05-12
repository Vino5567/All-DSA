package stack;

import java.util.Stack;

public class decode {
    public static void main(String[] args) {
        String s = "3[a]2[bc]";  //"2[abc]3[cd]ef"   s = "3[a2[c]]"
        System.out.println(decodeString(s));
    }


    public static String decodeString(String s) {
        Stack<Integer> stack = new Stack<>();
        Stack<StringBuilder> array = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                n = n * 10 + (c - '0');
            } else if (c == '[') {
                stack.push(n);
                n = 0;
                array.push(sb);
                sb = new StringBuilder();
            } else if (c == ']') {
                int k = stack.pop();
                StringBuilder temp = sb;
                sb = array.pop();
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
