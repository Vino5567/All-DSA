package pattern.alphabet;

public class first {
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
    
    private static void print(int n){
        for (int i = 0; i < n; i++) {
            char letter = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(letter + " ");
            }
            System.out.println();
        }

    }
}
