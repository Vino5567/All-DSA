package RecursionAndIteration;

public class mazeTwoPath {
    public static void main(String[] args) {
        TwoPath("", 3, 3);
    }
    //------------------------------------------------------------
    public static void path(String p, int row , int col){
        if(row == 1 && col == 1){
            System.out.println(p);
            return;
        }
        if(row > 1){
            path(p + "D", row - 1, col);
        }
        if(col > 1){
            path(p +"R", row, col - 1);
        }
    }
    //------------------------------------------------------------
    public static void TwoPath(String p, int row, int col){
        if(row == 1 && col == 1){
            System.out.println(p);
            return;
        }
        if(row > 1){
            TwoPath(p + "V", row - 1, col);
        }
        if(col >  1){
            TwoPath(p + "H", row , col -1);
        }
        if(row > 1 && col > 1){
            TwoPath(p + "D", row - 1, col - 1);
        }
    }
}
