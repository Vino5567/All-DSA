package pattern;

public class AEPattern {
    public static void main(String[] args) {
        int n = 6;
        int odd = 1, even = 2;

        for (int i = 1; i <= n; i++) {
            int num = (i % 2 != 0) ? odd : even;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num += 2;
            }
            if (i % 2 != 0) odd = num; else even = num;
            System.out.println();
        }
    }
}

//1
//2 4
//3 5 7
//6 8 10 12
//9 11 13 15 17
//14 16 18 20 22 24