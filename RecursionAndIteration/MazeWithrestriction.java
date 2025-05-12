package RecursionAndIteration;

public class MazeWithrestriction {
    public static void main(String[] args) {
        boolean[][] Board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        res("", Board, 0, 0);
    }
    public static void res(String p, boolean[][] Board, int row, int col){
        if(row == Board.length - 1 && col == Board[0].length - 1){
            System.out.println(p);
            return;
        }
        // this if statement for the block
        if(!Board[row][col]){
            return;
        }

        if(row < Board.length - 1){
            res(p + "V", Board, row + 1, col);
        }
        if(col < Board[0].length - 1){
            res(p + "H", Board, row, col + 1);
        }
        if(row < Board.length - 1 && col < Board[0].length - 1){
            res(p + "D", Board, row + 1, col + 1);
        }
    }
}
