/*Two-dimensional Arrays - 2D array has a type such as int[][] or String[][], with two pairs of square brackets. The elements of a 2D array are arranged in rows and columns, and the new operator for 2D arrays specifies both the number of rows and the number of columns.

You have  2D array multiplicationTable declared with 10 rows and 10 columns.
Write java program to populate the array with multiplication table values like in the 
 * 
 */
package repl_Arrays;

import java.util.Arrays;

public class R_143_2DMultipicationTable {

	public static void main(String[] args) {
		int[][] multiplicationTable = new int[10][10];

		for (int i = 0; i < multiplicationTable.length; i++) {
			for (int j = 0; j < multiplicationTable[i].length; j++) {
				multiplicationTable[i][j] = (i + 1) * (j + 1);
			}
		}

		System.out.println(Arrays.deepToString(multiplicationTable));
	}

}
