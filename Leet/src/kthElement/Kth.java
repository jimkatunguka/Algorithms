package kthElement;

import java.util.Arrays;

public class Kth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 3, 1, 8 };
		System.out.println(kthNumber(num, 2));

	}

	static public int kthNumber(int[] a, int k) {
		if (a.length < 1 || k > a.length)
			return -1;

		Arrays.sort(a);
		return a[k - 1];
	}

}
