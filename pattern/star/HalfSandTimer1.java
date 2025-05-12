package pattern.star;

public class HalfSandTimer1 {
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }

    private static void print(int n){
        for (int i = 1; i <= n * 2; i++) {
            if(i <= n){
                for (int j = 0; j < n - i + 1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }else{
                for (int j = 0; j < i - n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
