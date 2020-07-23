package repl_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class R_126_Olcay {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] array = str.split(", ");
		
		int min = array[0].length();
		int index=0;
		int count=0;
		for(int i=1; i<array.length; i++) {
			
			if(array[i].length()<min) {
				
				index=i;
				min=array[i].length();
			}
		}
		
		for(int i=0; i<array.length; i++) {
			if(array[i].length()==array[index].length()) {
				count++;
			}			
		}
		
		
		String[] arrayShort = new String[count];
		int arr=0;
		for(int i=0; i<array.length; i++) {
			if(array[i].length()==min) {
				arrayShort[arr]=array[i];
				arr++;
			}			
		}
		
		Arrays.sort(arrayShort);
		System.out.println(Arrays.toString(arrayShort));

	}

}
