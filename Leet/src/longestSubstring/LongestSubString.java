package longestSubstring;

import java.util.HashSet;

public class LongestSubString {

	public static void main(String[] args) {
		String s = "booandfoo";
		System.out.println(lengthOfLongestSubstring(s));

	}

	static public int lengthOfLongestSubstring(String s) {
		int i = 0;
		int j = 0;
		int max = 0;

		HashSet<Character> hashset = new HashSet<>();
		while (j < s.length()) {
			if (!hashset.contains(s.charAt(j))) {
				hashset.add(s.charAt(j));
				max = Math.max(hashset.size(), max);
				j++;

			} else {
				hashset.remove(s.charAt(i));
				i++;
			}

		}
		return max;

	}

}
