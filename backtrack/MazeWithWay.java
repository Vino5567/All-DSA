package backtrack;

import java.util.Arrays;

public class MazeWithWay {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int[maze.length][maze[0].length];
        way("", 0, 0, maze, path, 1);
    }
    public static void way(String p, int row, int col, boolean[][] maze, int[][] path, int step){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            path[row][col] = step;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println("---------------");
            return;
        }

        if(!maze[row][col]){
            return;
        }

        maze[row][col] = false;
        path[row][col] = step;

        if(row < maze.length - 1){
            way(p + 'D', row + 1, col, maze, path, step + 1);
        }
        if(col < maze[0].length - 1){
            way(p + 'R', row, col + 1, maze, path, step + 1);
        }
        if(row > 0){
            way(p + 'U', row - 1, col, maze, path, step + 1);
        }
        if(col > 0){
            way(p + 'L', row, col - 1, maze, path, step + 1);
        }

        maze[row][col] = true;
        path[row][col] = 0;
    }
}
