package leetcodeString;

import java.util.HashMap;

public class excelSheet {
    public static void main(String[] args) {
        int columnNumber = 7010; // 28
        System.out.println(findCol(columnNumber)); // in this problem we only note the formula.
    }

    public static String findCol(int i){
        StringBuilder sb = new StringBuilder();

        while(i>0){
            i--;
            sb.insert(0, (char) ((i%26) + 'A'));
            i = i / 26;
        }

        return sb.toString();
    }
}
