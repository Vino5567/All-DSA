package KnowRecursion.string;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        String str = "abc";
        sequence("", str);
        System.out.println();
        System.out.println(suquenceInList("", str));

    }

    public static void sequence(String ans, String s){
        if(s.isEmpty()){
            System.out.print(ans + " ");
            return;
        }
        char ch = s.charAt(0);
        
        sequence(ch + ans, s.substring(1));
        sequence(ans, s.substring(1));
    }

    public static ArrayList<String> suquenceInList(String p, String s){
        if(s.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = s.charAt(0);
        ArrayList<String> left = suquenceInList(ch + p, s.substring(1));
        ArrayList<String> right = suquenceInList(p, s.substring(1));

        left.addAll(right);
        return left;
    }
}
