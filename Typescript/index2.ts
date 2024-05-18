function isPalindrome(number: number): boolean {
  return number === reverseNumber(number);
}

function reverseNumber(number: number): number {
  let reversedNumber = 0;
  while (number > 0) {
    const digit = number % 10;       // Extract the last digit
    reversedNumber = reversedNumber * 10 + digit; // Append it to the reversed number
    number = Math.floor(number / 10);   // Remove the last digit from the original number
  }
  return reversedNumber;
}

function findDepth(number: number, currentDepth: number = 0): number {
  if (isPalindrome(number)) {
    return currentDepth;
  } else {
    const reversedNumber = reverseNumber(number);
    const sum = number + reversedNumber;
    return findDepth(sum, currentDepth + 1);
  }
}

const startInt: number = 10
const finishInt: number = 99

for (let counter = startInt; counter <= finishInt; counter++) {
  let intDepth: number = findDepth(counter, 0)
  console.log(`${counter} is a depth ${intDepth} palindrome.`)
}

console.log("\nDone.")
