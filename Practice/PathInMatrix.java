package Practice;

public class PathInMatrix {
    public static void main(String[] args) {
        int N = 5; // Size of matrix

        // Hardcoded input matrix
        int[][] matrix = {
                {1, 0, 1, 0, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 1, 0},
                {1, 0, 1, 1, 1},
                {0, 1, 1, 0, 1}
        };

        // Check if there's a path from (0,0) to (N-1,N-1)
        if (canReach(matrix, 0, 0, N)) {
            System.out.println("Yes"); // Path exists
        } else {
            System.out.println("No");  // No path found
        }
    }

    // DFS function to check path
    private static boolean canReach(int[][] matrix, int i, int j, int N) {
        // If out of bounds or on a wall, return false
        if (i < 0 || j < 0 || i >= N || j >= N || matrix[i][j] == 0) {
            return false;
        }

        // If reached the bottom-right cell, return true
        if (i == N - 1 && j == N - 1) {
            return true;
        }

        // Mark as visited to avoid cycles
        matrix[i][j] = 0;

        // Move right or down
        boolean right = canReach(matrix, i, j + 1, N);
        boolean down = canReach(matrix, i + 1, j, N);

        // Unmark the cell (optional, needed if we want to check multiple queries)
        matrix[i][j] = 1;

        return right || down;
    }
}
