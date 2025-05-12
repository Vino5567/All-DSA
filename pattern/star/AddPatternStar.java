package pattern.star;

public class AddPatternStar {
    public static void main(String[] args) {
        int n = 3;
        print(n);
    }
    private static void print(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i - 1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
