//package zoho;
//
//public class AddDigitToN0 {
//    public static void main(String[] args) {
//        int number = 2875;  // The number to modify
//        int digitToAdd = 4;  // The digit to add to each digit of the number
//
//        // Variable to store the final result
//        int result = 0;
//        int placeValue = 1;  // This keeps track of the place value (ones, tens, hundreds, etc.)
//
//        // Process the number digit by digit
//        while (number > 0) {
//            int digit = number % 10;  // Get the last digit of the number
//            int newDigit = digit + digitToAdd;  // Add the specified digit to the current digit
//
//            // Rebuild the number by adding the new digit at the correct place value
//            result = result + newDigit * placeValue;
//            placeValue *= 10;  // Move to the next place value (tens, hundreds, etc.)
//
//            number /= 10;  // Remove the last digit from the number
//        }
//
//        System.out.println("Result: " + result);  // Output the final result
//    }
//}
//
