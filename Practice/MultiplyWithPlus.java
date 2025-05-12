package Practice;

public class MultiplyWithPlus {
    public static void main(String[] args) {
        int a = 7, b = 6;
        System.out.println(multiply(a, b)); // Output: 42
    }



        public static int multiply(int a, int b) {
            int result = 0;

            while (b > 0) {
                if (b % 2 == 1) {  // If b is odd, add 'a' to result
                    result += a;
                }
                a += a;  // Double 'a' by adding itself
                b /= 2;  // Halve 'b'
            }

            return result;
        }
    }


