package missingNumber;

import java.util.HashSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 1, 4, 2, 3 };
		System.out.println(solution(A));

	}

	static public int solution(int[] A) {
		HashSet<Integer> numbers = new HashSet<>();
		for (int n : A) {
			if (n > 0) {
				numbers.add(n);
			}
		}
		int j = 1;
		for (j = 1; j <= A.length + 1; j++) {
			if (!numbers.contains(j)) {
				return j;
			}
		}
		return j;
	}

}
