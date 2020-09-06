package SumInArray;

import java.util.Arrays;

public class sumInArray2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumInArray(new int[]{1, 2, 3, 5, 4}, 9)));
    }

    public static int[] sumInArray(int[] nums, int target) {
        int left = 0;
        int right = (nums.length)-1;
        Arrays.sort(nums);

        while(left<right){
            if(nums[left] + nums[right] == target)
                return new int[]{nums[left], nums[right]};
            else if(nums[left] + nums[right] < target)
                left++;
            else
                right--;
        }
        return new int[]{};
    }
}
// Time O(log n)
// Space O(1) no maps and arrays