package kthMissingPositiveNumber_1539;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4};
        int k = 2;
        System.out.println(findKthPositive(a, k));
    }

    static public int findKthPositive(int[] arr, int k) {
        Set<Integer> present = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            present.add(arr[i]);
        }

        int count;
        for(int i=1; map.size()<k; i++){
            if(!present.contains(i)){
                if (map.isEmpty()) {
                    count = 1;
                    map.put(count, i);
                } else {
                    count = map.size() + 1;
                    map.put(count, i);
                }
            }
        }
        System.out.println(map.toString());
        return map.get(k);
    }
}
