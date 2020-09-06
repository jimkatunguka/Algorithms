package firstDuplicate;

import java.util.HashSet;

public class FirstDuplicate2 {
	public static void main(String[] args) {
		int[] i = { 1, 0, 1, 2, 2 };
		System.out.println(first_duplicate(i));
	}

	static int first_duplicate(int[] a) { // passed all tests
		HashSet<Integer> numSet = new HashSet<>();
		for (int i : a) {
			if (numSet.contains(i))
				return i;
			else
				numSet.add(i);
		}
		return -1;
	}
}
