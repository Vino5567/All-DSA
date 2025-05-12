package zoho;
// somthing went worng
public class ReverseString {

    public static void reverse(String s){
        int n = s.length() - 1;
        int right = s.length() - 1;
        int start = 0;


        while(right > 0){
            if(s.charAt(right) != ' '){
                right--;
            }else{
                start = right + 1;
                reverseStr(s, start, n);
                n = right--;
            }
        }
        reverseStr(s,start,n);
    }

    private static void reverseStr(String s1, int start, int n) {

        String s2 = "";

        for (int i = start; i <= n; i++) {
            s2 = s2 + s1.charAt(i);
        }
        System.out.println(s2);
    }

    public static void main(String[] args) {
        String s = "Today Is Holiday";

        reverse(s);

    }
}
