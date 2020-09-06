package secondHighest;

public class SecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 1 };

		System.out.println(secondHighest(nums));
	}

	static public int secondHighest(int[] a) {
		int max1 = a[0];
		int max2 = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max1)
				max1 = a[i];

			for (int j = 0; j < a.length; j++) {
				if (a[j] > max2 && a[j] < max1)
					max2 = a[j];

			}
		}
		return max2;

	}

}
