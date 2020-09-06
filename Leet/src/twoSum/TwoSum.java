package twoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String[]args) {
		int[]nums = {15, 15, 5, 17, 14};
		int target = 19;
		
		//System.out.println(Arrays.toString(nums));
		int[]solution = twoSum(nums, target);
		System.out.println(Arrays.toString(solution));	
	}
	
	public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int component = target - nums[i];
            
            if(map.containsKey(component)) {
            	return new int [] {map.get(component), i};
            }
            
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No corresponding two sums");
	}
}
