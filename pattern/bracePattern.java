package pattern;

public class bracePattern {
    public static void main(String[] args) {
        pattern(3);
    }

    private static void pattern(int p) {
        char a = '{';
        char b = '}';
        for (int i = 1; i <= p; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(a);
            }
            for (int j = 1; j < i + 1; j++) {
                System.out.print(b);
            }

            System.out.println();
        }
    }

}


//{}
//{} {{}}
//{} {{}} {{{}}}
//use for loops ans u want