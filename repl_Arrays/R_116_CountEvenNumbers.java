/*Given an array nums, calculate the count of even numbers in nums and print out to console.

nums → [2, 1, 2, 2, 1, 2,  3,  4, 3, 4]) → 6
nums → [2, 2, 5, 7, 9, 0,  3,  5, 2, 2]) → 5
nums → [1, 1,21,21,25,13, 17, 29, 11,3])  → 0
 * 
 */
package repl_Arrays;

import java.util.Scanner;

public class R_116_CountEvenNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		    int[] nums = new int[10];
		    for(int i = 0 ; i<=9 ; i ++){
		      nums[i] = input.nextInt();
		    }
		    
		    System.out.println(countEvenNumbers(nums));
		
	}
	public static int countEvenNumbers(int [] array) { 
		
		int count = 0;
		for(int i = 0;i<array.length;i++) {
			if(array[i]%2==0) {
				count++;
			}
			
		}
		return count;
		
		
		
		
	}

}
