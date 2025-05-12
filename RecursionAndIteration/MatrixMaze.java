package RecursionAndIteration;

public class MatrixMaze {
    public static void main(String[] args) {
        System.out.println(maze(3,3));
    }
    public static int maze(int row, int col){
        if(row == 1 || col == 1){
            return 1;
        }

        return (maze(row - 1, col) + maze(row , col - 1));
    }
}
