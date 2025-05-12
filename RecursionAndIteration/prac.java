package RecursionAndIteration;

public class prac {
    public static void main(String[] args) {
        String s = "abc";
        subset("",s);
    }

    public static void subset(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char c = up.charAt(0);
        subset(p + c, up.substring(1));
        subset(p, up.substring(1));
    }
}
