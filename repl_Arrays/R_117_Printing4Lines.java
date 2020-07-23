/*The code provided in your main method will take in eight Strings and save them into an array called arr.  
Print out the 4 lines using for loop: 
each line should contain a pair of array element as displayed below
user for loop

Example:
arr -> ["apple", "banana","kiwi", "grape","milk", "soda","juice", "coffee"] 
 prints:  apple , banana
          kiwi , grape
          milk, "soda"
          juice, coffee
 * 
 */
package repl_Arrays;

import java.util.Scanner;

public class R_117_Printing4Lines {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] arr = new String[8];
		for (int i = 0; i < 8; i++) {
			arr[i] = input.nextLine();
		}

		for (int i = 1; i <= arr.length; i++) {
			System.out.print(arr[i - 1]);
			if (i % 2 != 0) {
				System.out.print(" , ");
			} else {
				System.out.println();
			}
		}
	}
}
