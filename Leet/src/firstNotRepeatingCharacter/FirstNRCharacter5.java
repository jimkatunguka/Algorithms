package firstNotRepeatingCharacter;

import java.util.HashSet;

public class FirstNRCharacter5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bcccccccb"; // needs improvement to accommodate this string.
		System.out.println(firstNotRepeatingCharacter(s));

	}

	static char firstNotRepeatingCharacter(String s) {
		HashSet<Character> cHashSet = new HashSet<>();

		for (int i = 0; i < s.length(); i++) {
			if (!cHashSet.contains(s.charAt(i))) {
				cHashSet.add(s.charAt(i));
			} else {
				cHashSet.remove(s.charAt(i));
			}
		}
		int minIndex = 0;
		if (!cHashSet.isEmpty()) {
			minIndex = s.indexOf(cHashSet.iterator().next());
		}
		for (char c : cHashSet) {
			if (s.indexOf(c) < minIndex) {
				minIndex = s.indexOf(c);
			}
			return s.charAt(minIndex);
		}
		return '_';
	}

}
