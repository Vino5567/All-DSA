package zoho;

public class IsSquare {
    public static void main(String[] args) {
       int x1 = 20, y1 = 10, x2 = 10, y2 = 20,
                x3 = 20, y3 = 20, x4 = 10, y4 = 10;
       System.out.println(isSquare(x1,y1,x2,y2,x3,y3,x4,y4));

    }

    public static String isSquare(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        if(x1==x2 && y1==y2 && x3==x4 && y3==y4) return "No";
        int a=((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
        int b=(x4-x3)*(x4-x3)+(y4-y3)*(y4-y3);
        if( a==b){
            return "Yes";
        }
        return "No";
    }
}
