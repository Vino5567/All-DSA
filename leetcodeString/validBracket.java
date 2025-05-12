package leetcodeString;


import java.util.HashMap;
import java.util.Stack;

public class validBracket {
    public static void main(String[] args) {
        String s = "()"; //s = "([])"s = "(]"s = "()[]{}"
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

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
