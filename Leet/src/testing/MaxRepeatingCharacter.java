package testing;

public class MaxRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findRepeatingCharacter("aaaannuuuuuu"));

	}

	static int findRepeatingCharacter(String s) {
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
		System.out.println(temp);
		return count;
	}

}
