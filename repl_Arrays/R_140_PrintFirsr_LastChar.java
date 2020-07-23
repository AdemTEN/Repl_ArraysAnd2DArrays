/*Given a String array words, iterate through each word and print first and last letter of each element in the format below.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print → [ho, wy, by, ae, ne] 

 * 
 */
package repl_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class R_140_PrintFirsr_LastChar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	   
	    String str = "";
	    for(String each : words ){
	      str += each.substring(0,1) + each.substring(each.length()-1)+ " ";
	    }
	   String[] newWords = str.split(" ");
	    System.out.println(Arrays.toString(newWords));
	    

	}

}
