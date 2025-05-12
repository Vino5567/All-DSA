package Practice;

import java.util.HashMap;
import java.util.Stack;

public class ValidBracket {
    public static void main(String[] args) {
        String s = "[()]{}{[()()]()}";
        System.out.println(check(s));
    }
    private static boolean check(String s){
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for(char c : s.toCharArray()){
            if(map.containsValue(c)){
                stack.push(c);
            }else if(stack.isEmpty() || map.get(c) != stack.pop()){
                return false;
            }
        }
        return true;
    }
}
