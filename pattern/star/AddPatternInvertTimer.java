package pattern.star;

public class AddPatternInvertTimer {
    public static void main(String[] args) {
        int n = 3;
        print(n);
    }

    private static void print(int n) {
        for (int i = 1; i <= n * 2; i++) {

            int star = i <= n ? 2 * i - 1 : 2 * (2 * n - i) + 1; //using ('i', 'n', '-1', '2*n') we can bring all format
            int space = i <= n ? 2 * n - i : i - 1;

            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
