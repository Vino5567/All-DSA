package pattern.number;

public class Reverse {
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }

    private static void print(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
