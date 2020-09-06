package kitestring;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Fibonacci is " + fib(6));
	}

	static public int fib(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return fib(n - 2) + fib(n - 1);
	}
}
