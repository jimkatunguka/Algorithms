package sortArrayOf0sAnd1s;

import java.util.Arrays;

public class ByCountingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = { 0, 1, 1, 0, 1 };
		System.out.println(Arrays.toString(sortArray(a1)));

	}

	static int[] sortArray(int[] a) {
		// count zeros
		int zeroCount = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0)
				zeroCount++;
		}

		// add zeros
		for (int i = 0; i < zeroCount; i++) {
			a[i] = 0;
		}

		// add ones
		for (int i = zeroCount; i < a.length; i++) {
			a[i] = 1;
		}

		return a;
	}

}
