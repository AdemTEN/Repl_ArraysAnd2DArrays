/*Given a 2d array of ints, find the biggest number(int) in the array and print it.
 */
package repl_Arrays;

import java.util.Scanner;

public class R_142_2D_Largestnumber {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		int rows = inp.nextInt(), cols = inp.nextInt();
		int[][] arr = new int[rows][cols];
		for (int i = 0; i <= rows - 1; i++) {
			for (int j = 0; j <= cols - 1; j++) {
				arr[i][j] = inp.nextInt();
			} // end for cols
		} // end for rows

//		int max = 0;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				if (arr[i][j] > max) {
//					max = arr[i][j];
//
//				}
//			}
//		}
		int max = 0;
		for(int [] eachRow : arr) {
			for(int eachCol : eachRow) {
				if(eachCol > max) {
					max = eachCol;
				}
			}
		}
		
		System.out.println(max);

	}

}
