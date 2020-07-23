/*Given a String variable sentence, write code to get each word and assign to String reversed in reverse order. 

Example:
sentence -> "Java is fun"
reversed -> "fun is Java"
 * 
 */
package repl_Arrays;

import java.util.Scanner;

public class R_138_ReverseSentenceInString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();

		String reversed = "";
		
		String[] str = sentence.split(" ");
		for (int i = str.length - 1; i >= 0; i--) {
			reversed += str[i] + " ";
		}
		reversed = reversed.trim();

		
		System.out.println(reversed);

	}

}
