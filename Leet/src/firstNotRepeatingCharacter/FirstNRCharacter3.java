package firstNotRepeatingCharacter;

import java.util.HashMap;

public class FirstNRCharacter3 {

	public static void main(String[] args) {
		String s = "abacabad";
		System.out.println(firstNotRepeatingCharacter(s));

	}

	static char firstNotRepeatingCharacter(String s) { // good solution runs in n
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				map.replace(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.get(c) == 1)
				return c;
		}

		return '-';
	}
}
