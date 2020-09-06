package kitestring;

import java.util.HashMap;
import java.util.Map;

/*Given a string, return a string with only the odd occurrences of the strings
 * aabacaedia -> abacedia
 * */

public class OddOccurrencies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(oddOccurencies("aabacaedia"));

	}

	static String oddOccurencies(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
				if ((map.get(c)) % 2 != 0)
					sb.append(c);
			} else {
				map.put(c, 1);
				sb.append(c);
			}
		}
		return sb.toString();
	}

}
