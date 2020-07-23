/*Write a program that will find out shortest words in the given string str. If there are few words that are evenly short, print them all. Use split method in order to split str string variable and create an array of strings.  Print array with Arrays.toString() method. Sort array before printing. 
Split values by comma: split(", ");
input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
output: [cat, old, ray] 
 */
package repl_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class R_126_ShortestWords {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		String[] arr = str.split(", ");
		int min = arr[0].length();
		String newStr = "";

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() < min) {
				min = arr[i].length();

			}
		}
		for(int i=0; i<arr.length;i++) {
			if(arr[i].length()== min) {
				newStr += arr[i] + " "; 
			}
		}
		

		String[] newArray = newStr.split(" ");
		Arrays.sort(newArray);
		System.out.println(Arrays.toString(newArray));

	}

}
