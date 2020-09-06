package codingBat;

/*Given a non-empty string and an int n, 
 * return a new string where the char at index n has been removed. 
 * The value of n will be a valid index of a char in the original string 
 * (i.e. n will be in the range 0..str.length()-1 inclusive).

missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"*/

public class MissingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(missingChar("kitten", 1));
		System.out.println(missingChar("kitten", 0));
		System.out.println(missingChar("kitten", 4));
	}

	static String missingChar(String str, int n) {
		StringBuilder sb = new StringBuilder();
		if (n > 0 && n < str.length()) {
			sb.append(str.substring(0, n)).append(str.substring(n + 1, str.length()));
		} else {
			sb.append(str.substring(1));
		}
		return sb.toString();
	}

}
