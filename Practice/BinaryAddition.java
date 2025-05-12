package Practice;

public class BinaryAddition {
    public static void main(String[] args) {
        String a = "1010";
        String b = "11001";

        System.out.println("Sum: " + addBinary(a, b));
    }

    private static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1;
        int carry = 0;

        // Loop through both strings from right to left
        while (i >= 0 || j >= 0 || carry == 1) {
            int bit1 = (i >= 0) ? a.charAt(i) - '0' : 0;
            int bit2 = (j >= 0) ? b.charAt(j) - '0' : 0;

            // XOR for sum (1+1 = 10, so XOR gives only the rightmost bit)
            int sum = bit1 ^ bit2 ^ carry;
            result.append(sum);

            // Carry is set if at least two bits are 1
            carry = (bit1 & bit2) | (bit1 & carry) | (bit2 & carry);

            i--;
            j--;
        }

        return result.reverse().toString(); // Reverse the result to get the correct order
    }
}
