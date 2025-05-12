package zoho;

public class TwistedPrime {
    public static void main(String[] args) {
        int check = 43;
        System.out.println(chechkPrime(check));
    }

    private static boolean chechkPrime(int N) {
        boolean isprime = true;

        // Check if N is prime
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                isprime = false;
            }
        }

        int originalN = N; // Store the original value before reversing
        int rev = 0;

        // Reverse the number
        while (originalN > 0) {
            int b = originalN % 10;
            rev = rev * 10 + b;
            originalN = originalN / 10;
        }

        // Check if reversed number is prime
        for (int i = 2; i <= Math.sqrt(rev); i++) {
            if (rev % i == 0) {
                isprime = false;
            }
        }

        if (isprime) {
            return true;
        }
        return false;
    }

}
