package KnowRecursion;
//
public class CountSteps {
    public static void main(String[] args) {
        int num = 2;
        System.out.println(steps(num));
    }

    public static int steps(int n){
        int count = 0;
        return(helper(n, count)); // need to pass an arg like this helper function need
    }

    public static int helper(int n, int count){
        if(n == 0){
            return count;
        }
        return n % 2 == 0 ? helper(n / 2, ++count) : helper(n - 1, ++count);
    }
}
