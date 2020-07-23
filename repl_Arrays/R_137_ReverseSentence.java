/*Given a String variable sentence, write code to type each word in separate lines in a reverse order.
Example:
sentence -> "Java is fun"
Print
fun
is
Java
 * 
 */
package repl_Arrays;

import java.util.Scanner;

public class R_137_ReverseSentence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    
	    String [] str = sentence.split(" ");
	    for(int i=str.length-1;i>=0;i--){
	      System.out.println(str[i]);
	    }
		

	}

}
