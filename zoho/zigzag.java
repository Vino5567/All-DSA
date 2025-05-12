package zoho;

public class zigzag {
    public static void main(String[] args) {

        String s = "PAYPALISHIRING";
        int row = 4;

        System.out.println(convert(s, row));
    }

    public static String convert(String s, int row){
        if(row == 1)
            return s;

        String result = "";

        for(int i = 0; i < row; i++){
            int j = i;
            int flag = 1;

            while(j < s.length()){
                result += s.charAt(j);
                if(i == 0 || i == row-1){
                    j += (row-1) *2;
                }else if(flag % 2 != 0){
                    j += (row-1)*2 - (2*i);
                } else if (flag % 2 == 0) {
                    j += (2*i);
                }
                flag++;
            }
        }

        return result;
    }
}

//PINALSIGYAHRPI
