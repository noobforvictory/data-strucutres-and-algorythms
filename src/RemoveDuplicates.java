
public class RemoveDuplicates {
	public static boolean[] map = new boolean[26];

	public static void removeDuplicate(String str, int idx, String newStr) {
		if (idx == str.length()) {
			System.out.println(newStr);
			return;
		}
		if (map[str.charAt(idx) - 'a'] == false) {
			newStr += str.charAt(idx);
			map[str.charAt(idx) - 'a'] = true;
		}
		removeDuplicate(str, ++idx, newStr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abbccda";
		int idx = 0;
		removeDuplicate(str, idx, "");
	}

}
