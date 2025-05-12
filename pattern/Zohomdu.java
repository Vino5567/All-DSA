package pattern;

public class Zohomdu {
    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            int num = i;
            for (int j = 0; j < i; j++) {
                System.out.print(num + " ");
                num += (n - j - 1);
            }
            System.out.println();
        }
    }
}


//1
//2 6
//3 7 10
//4 8 11 13
//5 9 12 14 15
