package assignments;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Assignment9_ArraySort {

	/*
	 * Given values are 12 ,34,11,36,87,98,93. Store the values in Array and Print
	 * second and third largest number from the above values without using
	 * collections and default sort methods
	 */

	static int[] num = { 12, 34, 11, 36, 87, 98, 93 };

	
	public int[] sort() {

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length - 1; j++) {
				if (num[j] < num[j + 1]) {

					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;

				}
			}
		}
		return num;
	}

	public static void main(String[] args) {
		Assignment9_ArraySort jj = new Assignment9_ArraySort();
		
		int [] fh = (int[]) num;

		System.out.println(fh);

	}
}
