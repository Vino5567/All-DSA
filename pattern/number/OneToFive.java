package pattern.number;

public class OneToFive {
    public static void main(String[] args) {
        int n = 5;
        print(n);
        System.out.println("-------------");
        printInvert(n);
        System.out.println("-------------");

        printCombine(n);

    }

    private static void print(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    private static void printInvert(int n){
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    private static void printCombine(int n){
        for (int i = 1; i <= 2 * n; i++) {
            int Limit = i <= n? i : 2 * n - i + 1;
            for (int j = 0; j < Limit; j++) {
                System.out.print(Limit + " ");
            }
            System.out.println();
        }
    }

}
