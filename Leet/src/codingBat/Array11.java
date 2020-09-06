package codingBat;

/*Given an array of ints, 
 * compute recursively the number of times that the value 11 appears in the array. 
 * We'll use the convention of considering only the part of the array that begins at the given index. 
 * In this way, a recursive call can pass index+1 to move down the array. 
 * The initial call will pass in index as 0.


array11([1, 2, 11], 0) → 1
array11([11, 11], 0) → 2
array11([1, 2, 3, 4], 0) → 0*/

public class Array11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = { 1, 2, 11 };
		int[] a2 = { 11, 11 };
		int[] a3 = { 1, 2, 3, 4 };
		System.out.println(array11(a1, 0));
		System.out.println(array11(a2, 0));
		System.out.println(array11(a3, 0));

	}

	static int array11(int[] nums, int index) {
		if (index >= nums.length)
			return 0;
		if (nums[index] == 11)
			return 1 + array11(nums, index + 1);
		else
			return array11(nums, index + 1);

	}
}
