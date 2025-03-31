package assignments;

public class Assignment11 {

	static double power(double x, int y) {
		double result = 1;

		if (y > 0) {
			for (int i = 0; i < y; i++) {
				result *= x;
			}
		} else if (y == 0) {
			
			return 1;
		} else {
			for (int i = 0; i < -y; i++) {
				result *= x;
			}
			result = 1 / result;
		}

		return result;
	}

	public static void main(String[] args) {
		
		/*Example 1:
			Input: x = 2.00000, n = 10
			Output: 1024.00000*/
		System.out.println(power(2.00000, 10));

			/*Example 2:
			Input: x = 2.10000, n = 3
			Output: 9.26100*/
		System.out.println(power(2.10000, 3));

			/*
			 * Example 3: Input: x = 2.00000, n = -2 Output: 0.25000
			 */

		System.out.println(power(2.00000, -2));
		

	}

}
