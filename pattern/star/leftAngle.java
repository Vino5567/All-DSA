package pattern.star;

public class leftAngle {
    public static void main(String[] args) {
        int n = 5;
        topLeftAngle(n);
        leftAngle(n);
    }
    private static void leftAngle(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void topLeftAngle(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
