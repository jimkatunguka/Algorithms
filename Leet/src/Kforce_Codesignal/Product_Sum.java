package Kforce_Codesignal;

public class Product_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(digitsManipulations(123056));

	}

	static int digitsManipulations(int n) {
		int temp = n;
		int sum = 0;
		int product = 1;

		while (n != 0) {
			int digit = n % 10;
			n /= 10;

//			if (digit > 0 && n % digit == 0) {
			sum += digit;
			product *= digit;
			// }
		}
		return product;

	}

}
