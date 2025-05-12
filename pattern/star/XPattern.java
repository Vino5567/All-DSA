package pattern.star;

public class XPattern {
    public static void main(String[] args) {
        int n = 7;
        printX(n);
        System.out.println("-----------------");
        printN(n);
        System.out.println("-----------------");
        printSquare(n);
        System.out.println("-----------------");
        printSquareX(n);
    }
    private static void printX(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                if(i == j || i + j == n - 1){ // note
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printN(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                if(j == 0 || j == n - 1|| i == j){ // note
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printSquare(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                if(i == 0 || j == 0 || i == n - 1 || j == n - 1){ // note
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void printSquareX(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                if(i == 0 || j == 0 || i == n - 1 || j == n - 1 || i == j || i + j == n - 1){ // note
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
