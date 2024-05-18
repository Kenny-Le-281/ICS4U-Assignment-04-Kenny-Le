/*
 * This is the Palindrome program
 *
 * @author  Kenny Le
 * @version 1.0
 * @since   2024-05-17
 */

// This is the is Palindrome function
function isPalindrome(inputNumber: number): boolean {
  return inputNumber === reverseNumber(inputNumber)
}

// This is the reverseNumber function
function reverseNumber(inputNumber: number): number {
  let reversedNumber = 0
  while (inputNumber > 0) {
    // Extract the last digit
    const digit = inputNumber % 10
    // Append it to the reversed number
    reversedNumber = reversedNumber * 10 + digit
    // Remove the last digit from the original number
    inputNumber = Math.floor(inputNumber / 10)
  }
  return reversedNumber
}

// This is the findDepth function
function findDepth(inputNumber: number, currentDepth: number = 0): number {
  if (isPalindrome(inputNumber)) {
    return currentDepth
  } else {
    const reversedNumber = reverseNumber(inputNumber);
    const sum = inputNumber + reversedNumber
    return findDepth(sum, currentDepth + 1)
  }
}

// Loops through all the two-digit numbers to see if they are a palindrome
const startInt: number = 10
const finishInt: number = 99

for (let counter = startInt; counter <= finishInt; counter++) {
  let intDepth: number = findDepth(counter, 0)
  console.log(`Number: ${counter}, Depth: ${intDepth}`)
}

console.log("\nDone.")
