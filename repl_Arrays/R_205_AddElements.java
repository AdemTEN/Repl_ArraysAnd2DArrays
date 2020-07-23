/*Method addElements accepts 2 int arrays and adds each element value of two arrays and returns a new array. You can assume that each array has 5 elements

addElements(new int[][10, 40, 50, 3, 1],
            new int[][11, 0, 500, 44, 1101]);
--------
return array after adding values in the arrays:
             [21, 40, 550, 47, 1102]
 * 
 */
package repl_Arrays;

import java.util.Arrays;

public class R_205_AddElements {

	public static void main(String[] args) {
		
		int [] a = {1,2,3};
		int [] b = {4,5,6};
		System.out.println(Arrays.toString(addElements(a, b)));
	}
	public static int[] addElements(int[] a, int [] b ) {
		
		int [] newArr = new int[a.length];
		
		for(int i=0; i<newArr.length; i++) {
			newArr[i] = a[i] + b[i];
		}
		
		return newArr;
	}

}
