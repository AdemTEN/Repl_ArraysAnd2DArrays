/*Given a String variable sentence, write code to type each word in separate lines.

Example:
sentence -> "Java is fun"
Print
Java
is
fun 
 */
package repl_Arrays;

import java.util.Scanner;

public class R_135_SplitSentence {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		    String sentence = input.nextLine();
		    
		   String [] str = sentence.split(" ");
		   for(String each : str){
		     System.out.println(each);
		   }	

	}

}
