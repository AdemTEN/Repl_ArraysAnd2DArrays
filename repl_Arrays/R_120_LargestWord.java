/*Given the array words, it will print the word with the largest length. Assume that there are no 2 words with longest length

Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa
 * 
 */
package repl_Arrays;

import java.util.Scanner;

public class R_120_LargestWord {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		for (int i = 0; i < 5; i++) {

			words[i] = input.nextLine();

		}

		int largest = words[0].length();
		String largestWord = words[0];
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > largest) {
				largest = words[i].length();
				largestWord = words[i];

			}
		}
		System.out.println(largestWord);

	}

}
