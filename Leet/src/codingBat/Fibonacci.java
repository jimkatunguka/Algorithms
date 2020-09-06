package codingBat;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacci(1));
		System.out.println(fibonacci(2));
		System.out.println(fibonacci(3));
		System.out.println(fibonacci(4));
		System.out.println(fibonacci(5));
		// System.out.println(count);

	}

	static int count = 0;

	static int fibonacci(int n) {
		count++;
		if (n == 0 || n == 1)
			return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
