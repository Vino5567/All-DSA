package pattern;

public class APattern {
    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }

    public static void printPattern(int n) {
        char ch = 'A';
        boolean b = false;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (b == false) {
                    // Convert to uppercase without using built-in functions
                    System.out.print((ch >= 'a' && ch <= 'z') ? (char)(ch - 32) + " " : ch + " ");
                    b = true;
                } else {
                    // Convert to lowercase without using built-in functions
                    System.out.print((ch >= 'A' && ch <= 'Z') ? (char)(ch + 32) + " " : ch + " ");
                    b = false;
                }
                ch++;
            }
            System.out.println();
        }
    }
}

//A
//b C
//d E f
//G h I j
//K l M n O
