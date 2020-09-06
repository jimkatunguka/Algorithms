package maxConsecutiveCharacter;

public class MaxConsecChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxPower("axxeeeejj"));

	}

	static int maxPower(String s) {// number of maximum adjacent repeated characters in a string
		int count = 0;
		char temp = ' ';
		for (int i = 0; i < s.length(); i++) {
			int curr_count = 1;
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) != s.charAt(j))
					break;
				curr_count++;
			}
			if (curr_count > count) {
				count = curr_count;
				temp = s.charAt(i);
			}
		}
		return count;
		// return temp; -- the maximum repeating character.
	}
}
