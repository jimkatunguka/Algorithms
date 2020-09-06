package firstNotRepeatingCharacter;

public class FirstNRCharacter4 {

	public static void main(String[] args) {
		String s = "bcccccccb";
		System.out.println(firstNotRepeatingCharacter(s));

	}

	static char firstNotRepeatingCharacter(String s) { // perfect, runs in n
		int[] chars = new int[26];

		for (char c : s.toCharArray()) {
			chars[c - 'a']++;
			// System.out.println(c - 'a');
		}

		for (char c : s.toCharArray()) {
			if (chars[c - 'a'] == 1) {
				return c;
			}
		}
		return '_';
	}
}
