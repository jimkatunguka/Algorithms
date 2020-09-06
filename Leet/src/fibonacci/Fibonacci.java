package fibonacci;

public class Fibonacci {
	static long count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Fibonacci is " + fib(30));
		System.out.println("Number of calls are " + count);
	}

	static public int fib(int n) {
		count++;
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fib(n - 2) + fib(n - 1);
		}
	}

}
