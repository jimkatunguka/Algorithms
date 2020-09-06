package codingBat;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(12));
		System.out.println(count);
	}

	static int count = 0;

	static int factorial(int n) {
		count++;
		if (n == 0 || n == 1)
			return 1;
		return n * factorial(n - 1);
	}

}
