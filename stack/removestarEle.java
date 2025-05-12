package stack;

import java.util.Stack;

public class removestarEle {
    public static void main(String[] args) {
        String s = "leet**cod*e"; //s = "erase*****"
        System.out.println(removeStars(s));
    }

    public static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '*'){
                stack.pop();
            }else{
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();

        for( char c : stack){
            sb.append(c);
        }
        return sb.toString();
    }
}
