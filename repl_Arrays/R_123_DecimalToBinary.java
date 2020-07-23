/*Binary number is a number expressed in the base-2 numeral system or binary numeral system, 
 which uses only two symbols: typically 0 (zero) and 1 (one). 
 Each digit is referred to as a bit.
  
 Given an int variable decimal,  write java program to calculate binary value of the decimal variable
  and assign it binary array. print out value of binary array matching below format. 
 Feel free to use additional arrays or formulas.

Example:
decimal -> 3
binary -> [0, 0, 0, 0, 0, 0, 1, 1]

decimal -> 35
binary -> [0, 0, 1, 0, 0, 0, 1, 1]

decimal -> 255
binary -> [1, 1, 1, 1, 1, 1, 1, 1]
 */
package repl_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class R_123_DecimalToBinary {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int decimal = scan.nextInt();

		int[] binary = new int[8];
		int r = 0;
		for (int i = binary.length-1; i >= 0; i--) {
			r = decimal%2;
			binary[i] = r;
			decimal = decimal/2;
			if(decimal<2) {
				binary[i-1] = decimal;
				break;
			}
			
		}
		System.out.println(Arrays.toString(binary));

	}

}
