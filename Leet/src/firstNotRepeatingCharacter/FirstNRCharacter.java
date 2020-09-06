package firstNotRepeatingCharacter;

public class FirstNRCharacter {
	public static void main(String[] args) {
		String s = "abacabad";
		System.out.println(firstNotRepeatingCharacter(s));

	}

	static char firstNotRepeatingCharacter(String s) { // perfect, runs in n
		char[] c = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (s.indexOf(c[i]) == s.lastIndexOf(c[i])) {
				return c[i];
			}
		}
		return '_';
	}
}
