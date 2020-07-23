/* Given a 8x8 two-dimensional array of strings named chessboard.
 * Initialize values inside an array accordingly to the chess board.
 * So first element in the array, chessboard[0][0] should have a value "1a", and last element in the array, 
 * chessboard[7][7] should have a value "8h". 
 */
package repl_Arrays;

import java.util.Arrays;

public class R_171_2D_ChessBoard {

	public static void main(String[] args) {
		
		String [][] chessBoard = new String[8][8];
		char ch = 'a';
		for(int i = 0; i<chessBoard.length;i++) {
			ch = 'a';
			for(int j = 0; j<chessBoard[i].length;j++) {
				chessBoard[i][j] = (i+1)+""+ch;	
				ch++;
			}
			
		}
		
		
		
		
		
		
		System.out.println(Arrays.deepToString(chessBoard));
	}

}
