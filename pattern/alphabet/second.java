package pattern.alphabet;

public class second {
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
    private static void print(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print( (char) ('A' + j) + " ");
            }
            System.out.println();
        }
    }
}
