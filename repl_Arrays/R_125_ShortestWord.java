/*Write a program that will print the shortest word in the given array str. 

input: java, cable, red, vivid, remedy, grace
output: red
 */
package repl_Arrays;

import java.util.Scanner;

public class R_125_ShortestWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] str = { scan.next(), scan.next(), scan.next(), scan.next(), scan.next(), scan.next() };

		int min = str[0].length();
		String shortest = str[0];

		for (int i = 0; i < str.length; i++) {
			if (str[i].length() < min) {
				min = str[i].length();
				shortest = str[i];
			}

		}
		System.out.println(shortest);

	}

}
