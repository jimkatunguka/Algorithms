package codingBat;

/*Count recursively the total number of "abc" and "aba" substrings that appear in the given string.


countAbc("abc") → 1
countAbc("abcxxabc") → 2
countAbc("abaxxaba") → 2*/

public class CountAbc {

	static int countAbc(String str) {
		if (str.length() < 3)
			return 0;
//		if (str.length() == 3 && (str.equals("abc") || str.equals("aba")))
//			return 1;
		if (str.substring(0, 3).equals("abc") || str.substring(0, 3).equals("aba"))
			return 1 + countAbc(str.substring(3));
		return countAbc(str.substring(1));
	}

	public static void main(String[] args) {
// 		TODO Auto-generated method stub
		System.out.println(countAbc("abc"));
		System.out.println(countAbc("abcxxaba"));
		System.out.println(countAbc("abaxxaba"));
	}

}
