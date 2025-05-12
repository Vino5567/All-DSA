package KnowRecursion;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println(fibonacci(3));
    }

    public static int fibonacci(int a){
        if(a < 2){
            return a;
        }
        return fibonacci(a - 1) + fibonacci(a - 2);
    }

    public static class Factorial {
        public static void main(String[] args) {
            int n = 5;
            System.out.println(factorial(n));

        }

        private static int factorial(int n) {
            if(n <= 2){
                return 2;
            }
            return n * factorial(n - 1);
        }
    }
}
