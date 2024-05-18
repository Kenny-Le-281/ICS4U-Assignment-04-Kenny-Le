/*
 * This is the Palindrome program
 *
 * @author  Kenny Le
 * @version 1.0
 * @since   2024-05-17
 */

/**
 * A class to calculate the palindrome depth of numbers.
 */
public class PalindromeDepth {

    /**
     * Checks if a number is a palindrome.
     *
     * @param inputNumber The number to check.
     * @return True if the number is a palindrome, otherwise false.
     */
    public static boolean isPalindrome(int inputNumber) {
        return inputNumber == reverseNumber(inputNumber);
    }

    /**
     * Reverses the digits of a number.
     *
     * @param inputNumber The number to reverse.
     * @return The reversed number.
     */
    public static int reverseNumber(int inputNumber) {
        int reversedNumber = 0;
        while (inputNumber > 0) {
            int digit = inputNumber % 10;          // Extract the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append it to the reversed number
            inputNumber = inputNumber / 10;        // Remove the last digit from the original number
        }
        return reversedNumber;
    }

    /**
     * Finds the depth of a number to become a palindrome.
     *
     * @param number       The number to check.
     * @param currentDepth The current depth of recursion.
     * @return The depth of the palindrome.
     */
    public static int findDepth(int number, int currentDepth) {
        if (isPalindrome(number)) {
            return currentDepth;
        } else {
            int reversedNumber = reverseNumber(number);
            int sum = number + reversedNumber;
            return findDepth(sum, currentDepth + 1);
        }
    }

    /**
     * Main method to calculate and print palindrome depths for numbers from 10 to 99.
     *
     * @param args The command line arguments (unused).
     */
    public static void main(String[] args) {
        int startInt = 10;
        int finishInt = 99;

        for (int counter = startInt; counter <= finishInt; counter++) {
            int intDepth = findDepth(counter, 0);
            System.out.println("Number: " + counter + ", Depth: " + intDepth);
        }

        System.out.println("\nDone.");
    }
}
