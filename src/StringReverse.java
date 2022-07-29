
public class StringReverse {
	public static void reverseString(String str, int index) {
		if (index == 0) {
			System.out.print(str.charAt(0));
			return;
		}
		System.out.print(str.charAt(index));
		reverseString(str, index - 1);

	}

	public static void main(String[] args) {
		String str = "abcd";
		int index = str.length() - 1;
		reverseString(str, index);

	}

}
