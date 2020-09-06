package firstDuplicate;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstDuplicate3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 1, 2, 2, 1 };
		System.out.println(firstDuplicate(a));

	}

	static int firstDuplicate(int[] a) {
		Set<Integer> numSet = new HashSet<>();
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			if (numSet.contains(a[i]) && !map.containsKey(a[i])) {
				map.put(a[i], i);
			} else {
				numSet.add(a[i]);
			}
		}
		if (!map.isEmpty()) {
			return a[Collections.min(map.values())];
		} else {
			return -1;
		}
	}

}
