package testing;

import java.util.HashMap;
import java.util.Map;

public class RemoveOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeEven("aabacaedia")); // abacedia
	}

	static String removeEven(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		StringBuilder sBuilder = new StringBuilder();
		int count = 0;
		int newCount = 0;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (map.containsKey(c)) {
				count = map.get(c);
				newCount = count + 1;
				map.put(c, newCount);

				if (newCount % 2 != 0)
					sBuilder.append(c);

			} else {
				map.put(c, 1);
				sBuilder.append(c);
			}
		}
		return sBuilder.toString();
	}

}
