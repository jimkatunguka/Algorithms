package palindrome;
/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false
*/

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(validPalindrome("abca"));
	}

	// checks for a valid palindrome string when one character has been removed.--
	// not complete
	static boolean validPalindrome(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (s.length() < 1)
				return false;

			for (int j = 0; j < s.length() - 1; j++) {
				// if (i != j)
				sb.append(s.substring(i, j)).append(s.substring(j + 1, s.length() - 0));
				System.out.println(sb.toString());
			}
			return isPalindrome(sb.toString()) || isPalindrome(s);
		}
		// System.out.println();
		return false;
	}

	// checks if a string is a palindrome.
	static boolean isPalindrome(String s) {
		s = s.toLowerCase();
		int left = 0;
		int right = s.length() - 1;

		while (left < right) {
			if (!isValid(s.charAt(left))) {
				left++;
				continue;
			}
			if (!isValid(s.charAt(right))) {
				right--;
				continue;
			}

			if (s.charAt(left) == s.charAt(right)) {
				left++;
				right--;
			} else {
				break;
			}
		}
		return right <= left;
	}

	// checks for alphanumeric characters
	static boolean isValid(char c) {
		boolean isDigit = c >= "0".charAt(0) && c <= "9".charAt(0);
		boolean isChar = c >= "a".charAt(0) && c <= "z".charAt(0);
		return isDigit || isChar;
	}
}
