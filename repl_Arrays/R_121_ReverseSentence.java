/*Given a String variable sentence, write code to get each word and assign to String reversed in reverse order. 

Example:
sentence -> "Java is fun"
reversed -> "fun is Java"
 * 
 */
package repl_Arrays;

import java.util.Scanner;

public class R_121_ReverseSentence {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();

		String reversed = "";
		String[] arraySentence = sentence.split(" ");

		for (int i = arraySentence.length - 1; i >= 0; i--) {
			reversed += arraySentence[i] + " ";

		}

		reversed = reversed.trim();

		// End your code here. do not modify below statement
		System.out.println(reversed);

	}

}
