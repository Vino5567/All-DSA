package zoho;

public class IsContains {

    public static boolean isContains(String s1, String s2){
        boolean contains = false;
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) == s2.charAt(0)){
                for (int j = 0; j < s2.length(); j++) {
                    if(s1.charAt(i + j) == s2.charAt(j)){
                        contains = true;
                    }else{
                        contains = false;
                    }
                }
            }
        }
        return contains;
    }

    public static void main(String[] args) {
        String s1 = "sunday is funday";
        String s2 = "is";
        System.out.println(isContains(s1, s2));
    }
}
