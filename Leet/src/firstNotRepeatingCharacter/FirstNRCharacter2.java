package firstNotRepeatingCharacter;

public class FirstNRCharacter2 {

	public static void main(String[] args) {
		String s = "abadabad";
		System.out.println(firstNotRepeatingCharacter(s));

	}

	static char firstNotRepeatingCharacter(String s) { // good solution for n^2
		for (int i = 0; i < s.length(); i++) {
			boolean isSeen = false;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j) && i != j) {
					isSeen = true;
				}
			}
			if (!isSeen)
				return s.charAt(i);
		}
		return '_';
	}

}
