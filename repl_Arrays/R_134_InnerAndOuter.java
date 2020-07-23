package repl_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class R_134_InnerAndOuter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sizeInner = scan.nextInt();
		int sizeOuter = scan.nextInt();
		int[] inner = new int[sizeInner];
		int[] outer = new int[sizeOuter];
		for(int i = 0; i < sizeInner; i++) {
			inner[i] = scan.nextInt();
		}
		for(int j = 0; j < sizeOuter; j++) {
			outer[j] = scan.nextInt();
		}
		
		Arrays.sort(inner);
		Arrays.sort(outer);
		
		int count = 0;
		for(int k = 0; k<inner.length; k++){
		  for(int l = 0;l<outer.length;l++){
		    if(inner[k] == outer[l]){
		      count++;
		      break;
		    }
		  }
		  
		}
		
		if(count == inner.length){
		  System.out.println("true");
		}else{
		  System.out.println("false");
		  
		}
		
	}

}
