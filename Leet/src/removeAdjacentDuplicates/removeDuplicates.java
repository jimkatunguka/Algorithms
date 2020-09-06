package removeAdjacentDuplicates;

public class removeDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abbacafac";
		System.out.println(removeDuplicates(s));
	}

	static public String removeDuplicates(String S) {
		char[] chars = new char[S.length()];
		int count = 0;

		for (int i = 0; i < S.length(); i++) {
			if (count > 0 && S.charAt(i) == chars[count - 1]) {
				count--;
			} else {
				chars[count] = S.charAt(i);
				count += 1;
			}
		}
		return new String(chars, 0, count);
	}

}
