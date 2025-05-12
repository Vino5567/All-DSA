package pattern.number;

public class OneZero {
    public static void main(String[] args) {
        int n = 5;
        print(n);
        System.out.println("-------------");
        alternatePrint(n);
    }
    private static void print(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j % 2 == 0? 1 + " " : 0 + " ");
            }
            System.out.println();
        }

    }

    private static void alternatePrint(int n){
        for (int i = 1; i <= n; i++) {
            int k = i % 2 == 0 ? 0 : 1;
            for (int j = 0; j < i; j++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

    }
}
