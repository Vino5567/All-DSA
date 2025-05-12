package pattern.star;

public class RightAngletriangle {
    public static void main(String[] args) {
        int n = 5;
//        printDown(n);
        printUp(n);
    }

    private static void printDown(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    private static void printUp(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
