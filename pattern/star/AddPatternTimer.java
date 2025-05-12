package pattern.star;

public class AddPatternTimer {
    public static void main(String[] args) {
        int n = 3;

        for (int i = 1; i <= 2 * n; i++) {
            int stars = 0, spaces = 0;

            stars = i <= n? 2 * (n - i) + 1 : 2 * (i - n) - 1;
            spaces = i <= n? i - 1: 2 * n - i;

            // Print spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print("  ");
            }

            // Print stars
            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
