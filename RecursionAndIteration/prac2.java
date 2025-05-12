package RecursionAndIteration;

import java.util.ArrayList;

public class prac2 {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(subset("", s));
    }
    public static ArrayList<String> subset(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char c = up.charAt(0);
        ArrayList<String> right = subset(p + c, up.substring(1));
        ArrayList<String> left = subset(p, up.substring(1));

        right.addAll(left);
        return right;
    }
}
