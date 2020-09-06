package sorting;

public class SortingAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = { "abc1", "abc954" };
		System.out.println(sortingAlgorithm(a));

	}

	static public boolean sortingAlgorithm(String[] A) {
		boolean isSorted = true;
		for (int i = 1; i < A.length; i++) {
			if ((A[i].compareTo((A[i - 1]))) > 0)
				return isSorted;
		}
		return !isSorted;
	}

}
