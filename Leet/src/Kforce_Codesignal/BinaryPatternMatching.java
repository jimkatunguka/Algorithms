package Kforce_Codesignal;

import java.util.HashSet;

public class BinaryPatternMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(binaryPatternMatching1("010", "amazing"));

	}

	static int binaryPatternMatching1(String pattern, String s) {

		HashSet<Character> vowelSet = new HashSet<>();
		vowelSet.add('a');
		vowelSet.add('e');
		vowelSet.add('i');
		vowelSet.add('o');
		vowelSet.add('u');
		vowelSet.add('y');

		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			StringBuilder sBuilder = new StringBuilder();
			int index = i;

			for (int j = 0; j < pattern.length() && i < s.length(); j++) {
				if (vowelSet.contains(s.charAt(i))) {
					sBuilder.append('0');
				} else {
					sBuilder.append('1');
				}
				i++;
			}
			if (sBuilder.toString().equals(pattern)) {
				count++;
			}
			i = index;
		}
		return count;
	}

}
