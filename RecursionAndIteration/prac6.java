package RecursionAndIteration;

public class prac6 {
    public static void main(String[] args) {
        String s = "abc";
        permutation("", s);
    }
    public static void permutation(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for (int i = 0; i < p.length() + 1; i++) {
            String first = p.substring(0, i);
            String end = p.substring(i, p.length());
            permutation(first+ch+end ,up.substring(1));
        }
    }
}
