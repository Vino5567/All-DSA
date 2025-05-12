package KnowRecursion;

public class SomOfProduct {
    public static void main(String[] args) {
        int n = 90;
        System.out.println(product(n));
    }

    private static int product(int n) {
        if(n < 1){
           return 1;
        }
        return (n % 10) * product(n / 10);
    }
}
