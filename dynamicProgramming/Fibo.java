package dynamicProgramming;

public class Fibo {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
    }

    public static int fib(int n) {
        int prev = 1;
        int prev2 = 0;
        int cur = 0;

        for (int i = 0; i < n; i++) {
            cur = prev2 + prev;
            prev = prev2;
            prev2 = cur;
        }
        return cur;
    }
}
