package pattern.star;

public class Diamont {
    public static void main(String[] args) {
        int n = 5;
//        print(n);
        WithoutDulicateprint(n);
    }

    private static void print(int n){
        for (int i = 1; i <= 2 * n; i++) {

            int space = i <= n? n - i : i - n - 1;
            int star = i <= n? i : 2 * n - i + 1;

            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void WithoutDulicateprint(int n) {
        for (int i = 1; i < 2 * n; i++) {  // Changed loop limit to 2*n-1
            int space = i <= n ? n - i : i - n; // remove -1
            int star = i <= n ? i : 2 * n - i; // remove +1

            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
