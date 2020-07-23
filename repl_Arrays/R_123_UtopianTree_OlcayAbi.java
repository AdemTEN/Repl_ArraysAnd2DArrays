package repl_Arrays;

public class R_123_UtopianTree_OlcayAbi {

	public static void main(String[] args) {
		int[] treeSize = new int[10];
		int growth;
		
		growth=0;
		int totalGrowth=0; 
		for(int year=0; year<10; year++) {
			if(year>=0 && year<3) {
				growth=1;
			}else if(year>=3 && year<10) {
				growth=2;
			}
			treeSize[year]=treeSize[year]+growth;
			totalGrowth+= growth;
			System.out.println("year " + (year+1) + " - " + " growth " + growth + " cm");
			System.out.println("tree size: " + totalGrowth + "cm");
		}
	}

}
