package Practice;

public class StringMismatchPairs {
    public static void main(String[] args) {
        String str1 = "asdfghij";
        String str2 = "adsfgijh";

        printMismatchedPairs(str1, str2);
    }

    public static void printMismatchedPairs(String str1, String str2) {
        int n = str1.length();

        for (int i = 0; i < n - 1; i++) {
            String pair1 = str1.substring(i, i + 2);  // Adjacent pair from first string
            String pair2 = str2.substring(i, i + 2);  // Adjacent pair from second string

            if (!pair1.equals(pair2)) {  // Check if pairs are different
                System.out.println(pair1 + "-" + pair2);
            }
        }
    }
}
