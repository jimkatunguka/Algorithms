package codingBat;

/*Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.


countX("xxhixx") → 4
countX("xhixhix") → 3
countX("hi") → 0*/

public class CountX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countX("xxhixx"));
		System.out.println(countX("xhixhix"));
		System.out.println(countX("hi"));

	}

	static int countX(String str) {
		if (str.length() == 0)
			return 0;
		if (str.substring(0, 1).equals("x"))
			return 1 + countX(str.substring(1));
		return countX(str.substring(1));

	}

}
