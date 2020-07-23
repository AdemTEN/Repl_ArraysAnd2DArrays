/*The code provided in your main method will take in six Strings and save them into an array called arr.  
Print out the 3 neighboring items of the array in one line until the last line
each line should contain 3 neighboring items of array element as displayed below
user for loop

Example:
arr -> ["apple", "banana","kiwi", "grape","milk","soda"] 
 prints:  apple , banana , kiwi
          banana , kiwi , grape
          kiwi , grape , milk
          grape , milk , soda
 * 
 */
package repl_Arrays;

import java.util.Scanner;

public class R_118_Printing03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] arr = new String[6];
		for (int i = 0; i < 6; i++) {
			arr[i] = input.nextLine();
		}
		
		int count = 0;
		int countLine = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			count++;
			if (count != 3) {
				System.out.print(" , ");
			} else if (count == 3) {
				System.out.println();
				i -= 2;
				count = 0;
				countLine++;
				if (countLine == 4) {
					break;
				}
			}

		}

	}

}
