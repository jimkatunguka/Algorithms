package firstDuplicate;

import java.util.HashSet;

public class FirstDuplicate {

	public static void main(String[] args) {
		int[] a = { 1, 2, 1 };
		System.out.println(firstDuplicate(a));

	}

	static int firstDuplicate(int[] a) { // passed a few tests
		int i = 0;
		int j = 0;
		int first = -1;
		int index = 0;
		HashSet<Integer> numbers = new HashSet<>();

		while (j < a.length) {
			if (!numbers.contains(a[j])) {
				numbers.add(a[j]);
				j++;
			} else if (numbers.size() == 1) {
				index = j;
				return first = a[index];
			} else {
				first = a[j];
				numbers.remove(a[i]);
				i++;
			}
		}

		return first;

	}
}
