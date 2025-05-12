package KnowRecursion.string;

public class skipChar {
    public static void main(String[] args) {
        String s = "abccad";
        System.out.println(skip(s));

    }

    public static String skip(String s){
        if(s.isEmpty()){
            return "";
        }

        char ch = s.charAt(0);

        if(ch == 'a'){
            return skip(s.substring(1));
        }else{
            return ch + skip(s.substring(1));
        }
    }
}
