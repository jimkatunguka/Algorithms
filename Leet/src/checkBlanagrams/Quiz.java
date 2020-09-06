package checkBlanagrams;

public class Quiz {

	public static void main(String[] args) {
		String w1 = "x";
		String w2 = "y";
		int[] a = new int[5];
		System.out.println(checkBlanagrams(w1, w2));

	}

	static boolean checkBlanagrams(String word1, String word2) {
		int[] map = new int[26];

		for (int i = 0; i < word1.length(); i++) {
			map[word1.charAt(i) - 'a']++;
			map[word2.charAt(i) - 'a']--;
		}

		int str = 0;
		for (int i : map) {
			str += Math.abs(i);
		}
		return str == 2;
	}

}
