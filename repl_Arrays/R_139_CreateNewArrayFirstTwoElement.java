/*Given an int array of any length, print a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.

Example:
input 1, 2, 3 
output: [1, 2]

Example:
input 1,
output: [1]
 * 
 */
package repl_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class R_139_CreateNewArrayFirstTwoElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] num = new int[size];
		for(int i =0; i < size; i++) {
			num[i] = scan.nextInt();
		}
		int sizeNewArray;
		if(num.length<3){
		  sizeNewArray= num.length;
		}else{
		  sizeNewArray = 2;
		}
		int [] newArray = new int [sizeNewArray];
		for(int i =0;i<newArray.length;i++){
		  newArray[i] = num[i];
		}
		
		System.out.println(Arrays.toString(newArray));
		

	}

}
