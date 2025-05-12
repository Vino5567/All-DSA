package zoho;

public class SpaceTrim {

    public static void trim(String s){
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            if(s.charAt(left) == ' '){
                left++;
            }else if (s.charAt(right) == ' ') {
                right--;
            }else{
                System.out.println(s.substring(left, right) + ".");
                break;
            }
        }
    }

    public static void main(String[] args) {
        String s = "    Hardwork Never Fails         ";
        trim(s);
    }
}
