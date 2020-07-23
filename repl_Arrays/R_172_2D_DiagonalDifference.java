/*Given a square matrix, calculate the absolute difference between the sums of its diagonals.
For example, the square matrix  is shown below:
1 2 3
4 5 6
9 8 9  

The left-to-right diagonal = 1+5+9 = 15. The right to left diagonal =  3+5+9 = 17. 
Their absolute difference is |15-17| = 2.
 * 
 */
package repl_Arrays;

import java.util.Scanner;

public class R_172_2D_DiagonalDifference {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[][] matrix = new int[][] { { scan.nextInt(), scan.nextInt(), scan.nextInt() },
				{ scan.nextInt(), scan.nextInt(), scan.nextInt() },
				{ scan.nextInt(), scan.nextInt(), scan.nextInt() } };
				
		int result = 0;
		int leftToRight = 0;
		int rightToLeft = 0;
		int k = matrix.length - 1;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < 1; j++) {
				leftToRight += matrix[i][i];
				rightToLeft += matrix[i][k];
				k--;
			}
		}

		result = leftToRight - rightToLeft;
		// FINAL PRINT
		System.out.println(Math.abs(result));
	}

}
