package kitestring;
/* Given a string that contains a single pair of parenthesis, compute 
 * recursively a new string made of only of the parenthesis and their 
 * contents, so "xyz(abc)123" yields "(abc)".
 */

public class ParenBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "xyz(abc)123";
		String s2 = "a";
		String s3 = "(xy)1";

		System.out.println(parenBit(s1));
		System.out.println(parenBit(s2));
		System.out.println(parenBit(s3));

	}

	static String parenBit(String str) {
		if (str == null) // optional
			throw new IllegalArgumentException("Parameter is null");

		if (str.length() < 2)// optional
			return str;

		if (str.charAt(0) != '(')
			return parenBit(str.substring(1));

		if (str.charAt(str.length() - 1) != ')')
			return parenBit(str.substring(0, str.length() - 1));

		return str;
	}

	static String parenBit2(String str) {

		if (str.equals(""))
			return str;
		if (str.charAt(0) == '(') {
			if (str.charAt(str.length() - 1) == ')') {
				return str;
			} else {
				return parenBit2(str.substring(0, str.length() - 1));
			}
		} else {
			return parenBit2(str.substring(1));
		}

	}

}
