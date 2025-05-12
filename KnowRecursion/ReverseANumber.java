package KnowRecursion;

public class ReverseANumber {
    public static void main(String[] args) {
        int n = 1824;
        System.out.println(rev(n));
        System.out.println(palin(n));
    }

    private static boolean palin(int n){
        return n == rev(n);
    }

    private static int helper(int n, int digits){
        if(n % 10 == n){
            return n;
        }
        int rem = n % 10; // take the last digit
        return rem * (int)Math.pow(10, digits - 1) /* changing tens here + vice versa */ + helper(n / 10, digits - 1);
    }

    private static int rev(int n) {
        int digits = (int) Math.log10(n) + 1; // taking digits = 4
        return helper(n, digits); // pass to helper func
    }

    public static class OneToN {
        public static void main(String[] args) {
            int n = 5;
            print(n);
        }

        private static void print(int n) {

            if(n == 0){
                return;
            }
            print(n - 1);
            System.out.println(n);
        } // this is for 1 to 5 and below is for 5 to 1


    //    private static void print(int n) {
    //
    //        if(n <= 1){
    //            System.out.println(1);
    //            return;
    //        }
    //        System.out.println(n);
    //        print(n - 1);
    //    }
    }
}
