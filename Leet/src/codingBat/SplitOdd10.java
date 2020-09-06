package codingBat;

/*Given an array of ints, is it possible to divide the ints into two groups, 
 * so that the sum of one group is a multiple of 10, 
 * and the sum of the other group is odd. Every int must be in one group or the other. 
 * Write a recursive helper method that takes whatever arguments you like, 
 * and make the initial call to your recursive helper from splitOdd10(). (No loops needed.)


splitOdd10([5, 5, 5]) → true
splitOdd10([5, 5, 6]) → false
splitOdd10([5, 5, 6, 1]) → true
*/

public class SplitOdd10 {

	public static void main(String[] args) {
		int[] a1 = { 5, 5, 5 };
		int[] a2 = { 5, 5, 6 };
		int[] a3 = { 5, 5, 6, 1 };
		System.out.println(splitOdd10(a1));
		System.out.println(splitOdd10(a2));
		System.out.println(splitOdd10(a3));

	}

	static boolean splitOdd10(int[] nums) {
		return splitOdd10Helper(nums, 0, 0, 0);
	}

	private static boolean splitOdd10Helper(int[] nums, int index, int sum1, int sum2) {

		if (index >= nums.length)
			return (sum1 % 10 == 0 && sum2 % 2 != 0) || (sum2 % 10 == 0 && sum1 % 2 != 0);

		int value = nums[index];

		return splitOdd10Helper(nums, index + 1, sum1 + value, sum2)
				|| splitOdd10Helper(nums, index + 1, sum1, sum2 + value);
	}

}
