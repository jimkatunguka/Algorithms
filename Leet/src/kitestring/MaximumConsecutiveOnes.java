package kitestring;

import java.util.HashSet;
import java.util.Set;

/*Given an integer return the maximum number of 1s
 * 1011001111 -> 4
 * */

public class MaximumConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 0, 1, 1, 1, 0, 0, 1 };
		System.out.println(findMaximumConsecutiveOnes(nums));

	}

	static int findMaximumConsecutiveOnes(int[] nums) {
		Set<Integer> counts = new HashSet<>();
		int count = 0;
		int new_count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count++;
				new_count = count;
				counts.add(new_count);
			} else {
				count = 0;
			}
		}
		// Alternative for the following code. return Collections.max(counts);
		int max_count = 0;
		for (int i : counts) {
			if (i > max_count) {
				max_count = i;
			}
		}
		return max_count;
	}

}
