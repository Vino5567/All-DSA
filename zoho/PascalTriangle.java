package zoho;

public class PascalTriangle {

    public static void main(String[] args) {
        int numRows = 5; // You can change the number of rows you want to print
        printPascalsTriangle(numRows);
    }

    // Function to print Pascal's Triangle up to 'numRows' rows
    public static void printPascalsTriangle(int numRows) {
        // 2D array to store values of Pascal's Triangle
        int[][] triangle = new int[numRows][];

        for (int i = 0; i < numRows; i++) {
            // Allocate space for each row
            triangle[i] = new int[i + 1];

            // First and last element of each row is always 1
            triangle[i][0] = triangle[i][i] = 1;

            // Fill the inner values of the triangle
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        // Print Pascal's Triangle
        for (int i = 0; i < numRows; i++) {
            // Print leading spaces for formatting
            for (int j = 0; j < numRows - i - 1; j++) {
                System.out.print(" ");
            }

            // Print values of each row
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }

            System.out.println(); // Move to the next line after each row
        }
    }


}
