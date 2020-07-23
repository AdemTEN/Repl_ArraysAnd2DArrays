package repl_Arrays;

import java.util.Arrays;

public class R_123_UtopianTree_02 {

	public static void main(String[] args) {

		int[] utopian = new int[10];
		for (int i = 0; i < utopian.length; i++) {
			if (i > 2) {
				utopian[i] = 2;
			} else {

				utopian[i] = 1;

			}

		}
		// System.out.println(Arrays.toString(utopian));
		int totalsize = 0;
		for (int i = 0; i < utopian.length; i++) {
			totalsize += utopian[i];
			System.out.println("year " + (i + 1) + " - " + " growth " + utopian[i] + " cm");
			System.out.println("tree size: " + totalsize + "cm");

		}

	}
}