import java.util.HashSet;

public class SubsequenceOfAString {
public static void printSubseq(String str, int idx, String newStr, HashSet<String> set) {
	if(idx == str.length()) {
		if(!set.contains(newStr)) {
			System.out.println(newStr);
			set.add(newStr);
			return;
		}else {
			return;
		}
		// time complexity => 2^n; n= size of string; O(2^n) is usually for tree structures where nodes split in 2
	}
	printSubseq(str, idx+1, newStr+str.charAt(idx), set);
	printSubseq(str, idx+1, newStr, set);
}
	public static void main(String[] args) {
		HashSet <String> set = new HashSet<String>(); // used to print unique stings use str = "aaa" to test
String str = "abc";
printSubseq(str,0,"",set);
	}

}
