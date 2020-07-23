/*Given an array nums with 7 integers every element is repeated twice - except one. 
 * Find that element and print it to console.

Example:

nums -> [1, 1, 2, 3, 4, 3, 4]
 Output : 2
 */
package repl_Arrays;

import java.util.Scanner;

public class R_122_FindNunDuplicate {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    
		int[] nums = {input.nextInt(), input.nextInt(),
	    		input.nextInt(),input.nextInt(),
	    		input.nextInt(),input.nextInt(),input.nextInt()};
		
		int aloneNumber = 0;
		int count = 0;
		for(int i= 0; i<nums.length; i++) {
			count = 0;
			for (int j = 0; j < nums.length; j++) {
				
				if(nums[i] == nums[j]) {
					count++;
					
								
					}
				}
			
			if(count == 1) {
				aloneNumber = nums[i];
				break;
			}
		}
		System.out.println(aloneNumber);

	}

}
