package reverseString;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "Katunguka";
		System.out.println(reverse(string));

	}

	static public String reverse(String str) {
		// StringBuilder stringBuilder =new StringBuilder();
		String st = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			st = st + (str.charAt(i));
			// stringBuilder.append(str.charAt(i));
		}
		return st;

	}

}
