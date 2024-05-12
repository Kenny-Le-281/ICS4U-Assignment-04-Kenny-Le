/*
 * This is the PalindromeDepth program
 *
 * @author  Kenny Le
 * @version 1.0
 * @since   2024-05-08
 */

/*
 * This function calculates the palindrome depth of a number
 */
function PalindromeDepth(integer: number, currentDepth: number): number {
    // reverse the integer
    const reversedInteger: number = integer.toString().split('').reverse().join('')
    // check if integer is a palindrome
    if (integer == reversedInteger) {
      return currentDepth
    } else {
      const sum: number = parseInt(integer) + parseInt(reversedInteger)
      return PalindromeDepth(sum, currentDepth + 1)
    }
  }
  
  
  const startInt: number = 10
  const finishInt: number = 99
  
  for (let counter = startInt; counter <= finishInt; counter++) {
    let intDepth: number = PalindromeDepth(counter, 0)
    console.log(`${counter} is a depth ${intDepth} palindrome.`)
  }
  
  console.log("\nDone.")
  