/*
 * This is the Palindrome program
 *
 * @author  Kenny Le
 * @version 1.0
 * @since   2024-05-17
 */

public class PalindromeDepth {

    // Check if a number is a palindrome
    public static boolean isPalindrome(int inputNumber) {
        return inputNumber == reverseNumber(inputNumber);
    }

    // Reverse the digits of a number
    public static int reverseNumber(int inputNumber) {
        int reversedNumber = 0;
        int number = inputNumber;
        while (number > 0) {
            int digit = number % 10;          // Extract the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append it to the reversed number
            number = number / 10;        // Remove the last digit from the original number
        }
        return reversedNumber;
    }

    // Find the depth of a number to become a palindrome
    public static int findDepth(int number, int currentDepth) {
        if (isPalindrome(number)) {
            return currentDepth;
        } else {
            int reversedNumber = reverseNumber(number);
            int sum = number + reversedNumber;
            return findDepth(sum, currentDepth + 1);
        }
    }

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
