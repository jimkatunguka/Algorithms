package nthLargestNumber;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class NthLargestNumber {
    public static void main(String[] args) {
       int[] a = {3,2,1,5,6,4};
       System.out.println(nthLargestUsingStreams(2, a));
//        sort();
    }

    public static int nthLargest (int k, int[] nums){
        if(k > nums.length) return 0;
        int[] sortedNums = Arrays.stream(nums)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int i=0; i<sortedNums.length; i++) {
            treeMap.put(i+1, sortedNums[i]);
        }
        return treeMap.get(k);
    }

    public static int nthLargestUsingStreams (int k, int[] nums){
//        if(k > nums.length) return 0;
        return Arrays.stream(nums)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(k-1)
                .mapToInt(Integer::intValue)
                .findFirst()
                .orElse(0);
    }

    public static void sort() {
        int [] nums = {5, 2, 5, 8, 1, 9};

        int[] sortedNums = Arrays.stream(nums)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        // Print the sorted numbers
        for (int num : sortedNums) {
            System.out.println(num);
        }
    }
}
