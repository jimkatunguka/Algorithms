package LetterOccurences;

import java.util.HashSet;

public class LetterOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaaa";
		System.out.println(solution(str));

	}

	static public boolean solution(String S) {
		HashSet<Character> set = new HashSet<>();

		if (S.length() < 1 || S.length() > 300000)
			return false;
		for (int i = 0; i < S.length(); i++) {
			if ((S.charAt(i) != 'b') && (S.charAt(i) != 'a'))
				return false;

			if (set.contains('b') && S.charAt(i) == 'a') {
				return false;
			} else {
				set.add(S.charAt(i));
			}
		}
		return true;
	}

}
