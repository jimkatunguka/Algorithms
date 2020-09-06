package palindrome;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(validPalindrome("A man, a plan, a canal: Panama"));

	}

	public static boolean validPalindrome(String s) {
		int start = 0;
		int end = s.length() - 1;
		while (start < end) {
			if (s.charAt(start) != s.charAt(end)) {
				return isPalindrome(s, start + 1, end) || isPalindrome(s, start, end - 1);
			}
			start++;
			end--;
		}
		return true;
	}

	public static boolean isPalindrome(String s, int i, int j) {
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
