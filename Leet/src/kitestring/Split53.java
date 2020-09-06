package kitestring;

/*
 * Given an array of ints, is it possible to divide the ints into two groups,
	so that the sum of the two groups is the same, with these constraints:
	all the values that are multiple of 5 must be in one group, 
	and all the values that are a multiple of 3 (and not a multiple of 5) must be in the other.
	(No loops needed.)
	
	split53([1, 1]) → true
	split53([1, 1, 1]) → false
	split53([2, 4, 2]) → true
*/

public class Split53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = { 1, 1 };
		int[] a2 = { 1, 1, 1 };
		int[] a3 = { 2, 4, 2 };
		System.out.println(split53(a1));
		System.out.println(split53(a2));
		System.out.println(split53(a3));
	}

	static boolean split53(int[] nums) {
		int index = 0;
		int sum1 = 0;
		int sum2 = 0;

		return split53Helper(nums, index, sum1, sum2);

	}

	static boolean split53Helper(int[] nums, int index, int sum1, int sum2) {

		if (index >= nums.length)
			return sum1 == sum2;

		int value = nums[index];

		if (value % 5 == 0)
			return split53Helper(nums, index + 1, sum1 + value, sum2);

		else if (value % 3 == 0)
			return split53Helper(nums, index + 1, sum1, sum2 + value);

		else
			return (split53Helper(nums, index + 1, sum1 + value, sum2)
					|| split53Helper(nums, index + 1, sum1, sum2 + value));
	}

}
