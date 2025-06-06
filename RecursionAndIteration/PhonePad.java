package RecursionAndIteration;

import java.util.ArrayList;
import java.util.List;

public class PhonePad {
    public static void main(String[] args) {
//        pad("", "12");
//        System.out.println(padInList("", "12"));
        pad("", "12");
    }
    //------------------------------------------------------------
    public static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            pad(p + ch , up.substring(1));
        }
    }
    //------------------------------------------------------------

    public static List<String> padInList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            ans.addAll( padInList(p + ch , up.substring(1) ));
        }
        return ans;
    }
    //-------------------------------------------------------------------


    public static int padcount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            count = count +  padcount(p + ch , up.substring(1) );
        }
        return count;
    }
}
