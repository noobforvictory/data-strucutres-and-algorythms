
public class KeyboardCombinations {
	public static String keypad[] = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

	public static void printKeypadCombo(String num, int idx, String combo) {
		if (idx == num.length()) {
			System.out.println(combo);
			return;
		}
		int key = num.charAt(idx) - '0';
		for (int i = 0; i < keypad[key].length(); i++) {
			char currentChar = keypad[key].charAt(i);
			printKeypadCombo(num, idx + 1, combo + currentChar);
		}
	}

	public static void main(String[] args) {
		String num = "23";
		printKeypadCombo(num, 0, "");
		// time complexity => 4^n
		// n is the max length of num string and 4 is the max no of char in a key , this
		// forms a tree node structure so 4^n
	}

}
