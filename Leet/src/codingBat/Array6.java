package codingBat;
/*Given an array of ints, compute recursively if the array contains a 6. 
 * We'll use the convention of considering only the part of the array that begins at the given index. 
 * In this way, a recursive call can pass index+1 to move down the array. 
 * The initial call will pass in index as 0.
array6([1, 6, 4], 0) → true
array6([1, 4], 0) → false
array6([6], 0) → true*/

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = { 1, 6, 4 };
		int[] a2 = { 1, 4 };
		int[] a3 = { 6 };

		System.out.println(array61(a1, 0));
		System.out.println(array61(a2, 0));
		System.out.println(array61(a3, 0));

	}

	// returns true if there is a 6 in the array
	static boolean array6(int[] nums, int index) {
		if (index >= nums.length)
			return false;
		if (nums[index] == 6)
			return true;

		return array6(nums, index + 1);
	}

	// returns number of 6s
	static int array61(int[] nums, int index) {
		if (index >= nums.length)
			return 0;
		if (nums[index] == 6)
			return 1 + array61(nums, index + 1);

		return array61(nums, index + 1);
	}
}
