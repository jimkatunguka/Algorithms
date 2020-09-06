package SumInArray;

import java.util.*;

public class SumInArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumInArray(new int[]{1, 2, 3, 5}, 5)));
    }

    public static int[] sumInArray(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] myArray = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];

            if (map.containsKey(num)) {
                return new int[]{map.get(num), i};
            }

            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("numbers not found");
    }
}
