/*Given a String variable email, write code using split method to print email id and domain in separate lines.

Example:
email -> info@cybertekschool.com
Print:  
Email id: info
Email domain: cybertekschool.com


If email contains no @ character or multiple @ characters then print invalid email:

email -> hello-gmail.com
print:  
invalid email

email -> my@fancy@email.com
print:  
invalid email
 * 
 */
package repl_Arrays;

import java.util.Scanner;

public class R_119_Split {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    String email = input.nextLine();
	   
	    String [] array = email.split("@");
	    
	    if(array.length == 1 || array.length>2){
	      System.out.println("invalid email");
	    }else{
	    System.out.println("Email id: " + array[0]);
	    System.out.println("Email domain: " + array[1]);  
	    }

	}

}
