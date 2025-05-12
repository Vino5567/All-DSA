package backtrack;

public class Maze {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        path("", maze, 0, 0);
    }
    public static void path(String p,boolean[][] maze, int row, int col){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(p);
            return;
        }

        if(!maze[row][col] ){
            return;
        }

        maze[row][col] = false;

        if(row < maze.length - 1){
            path(p + "D", maze, row + 1, col);
        }
        if(col < maze[0].length - 1){
            path(p + "R", maze, row, col + 1);
        }
        if(row > 0){
            path(p + "U", maze, row - 1, col);
        }
        if(col > 0){
            path(p + "L", maze, row, col - 1);
        }

        maze[row][col] = true;
    }
}
