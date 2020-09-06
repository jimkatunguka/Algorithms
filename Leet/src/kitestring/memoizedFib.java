package kitestring;

public class memoizedFib {
	static final int LEN = 100;
    static long count = 0;
    static int[] F = new int[LEN];

    static void initializeArray() {
        for (int i = 0; i < F.length; i++)
            F[i] = -1;
    }

    static int fib(int n) {
        count++;
        if (F[n] == -1)
            if (n <= 1)
                F[n] = n;
            else
                F[n] = fib(n - 1) + fib(n - 2);

        return F[n];
    }

    public static void main(String[] args) {
        int n = 30;
        initializeArray();
        System.out.println("Fibonacci is " + fib(n));
        System.out.println("Number of calls are " + count );
    }

}
