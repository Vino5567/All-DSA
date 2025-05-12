package ZohoJanQues;

public class TrianglePattern {
    public static void main(String[] args) {
//        need to write edge case here

        int red = 8, blue = 4;
        int n = red + blue;
        int row = 0;

        int k = 1;
        while(k <= n) {
            if((k*(k+1)/2) <= n){
                k++;
                row++;
            }else{
                System.out.println("Row:" + row);
                break;
            }
        }
    }
}
