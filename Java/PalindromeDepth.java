/*
 * This is the Palindrome program
 *
 * @author  Kenny Le
 * @version 1.0
 * @since   2024-05-17
 */

public class PalindromeDepth {
    
    // Private constructor to prevent instantiation
    private PalindromeDepth() {
        throw new IllegalStateException("Cannot be instantiated");
    }
    
    // Since long is 64-bit, it offers a larger range of integers which is needed for this program.
    // This is why long is used instead of standard integers.
    /**
     * This function calculates the palindrome depth of a number.
     * 
     * @param integer The input number for which palindrome depth is to be calculated.
     * @param currentDepth The current depth of recursion.
     * @return The depth of the palindrome.
     */
    public static int palindromeDepth(long integer, int currentDepth) {
        // Reverse the integer
        long reversedInteger = reverseInteger(integer);

        // Check if integer is a palindrome
        if (integer == reversedInteger) {
            return currentDepth;
        } else {
            long sum = integer + reversedInteger;
            return palindromeDepth(sum, currentDepth + 1);
        }
    }

    /**
     * This function reverses an integer.
     * 
     * @param number The integer to be reversed.
     * @return The reversed integer.
     */
    public static long reverseInteger(long number) {
        long reversedNumber = 0;
        while (number != 0) {
            long digit = number % 10; // Extract the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append it to the reversed number
            number /= 10; // Remove the last digit
        }
        return reversedNumber;
    }

    public static void main(String[] args) {
        int startInt = 10;
        int finishInt = 99;

        for (int counter = startInt; counter <= finishInt; counter++) {
            int intDepth = palindromeDepth(counter, 0);
            System.out.println(counter + " is a depth " + intDepth + " palindrome.");
        }

        System.out.println("\nDone.");
    }
}
