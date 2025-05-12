package KnowRecursion;

public class CountNo {
    public static void main(String[] args) {
        int n = 30400005;
        System.out.println(count(n, 0));
    }

    private static int count(int n, int count) {
        if(n % 10 == n){
            return count; // note here the value 5 is passing all through the main
        }
        int rem = n % 10;
        return rem == 0 ? count(n / 10, ++count) : count(n / 10, count);
    }
}
