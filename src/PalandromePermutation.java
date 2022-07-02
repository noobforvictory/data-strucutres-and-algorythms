
public class PalandromePermutation {
public static boolean palandromePermutation(String input) {
	int[] arr = new int[128];
	for(int i=0; i<input.length(); i++) {
		if(input.charAt(i)==' ') {
			arr[input.charAt(i)]++;
		}
	}
	int count = 0;
	for (int i =0; i<128; i++) {
		count += arr[i]%2;
	}
	return count<=1;
}
	public static void main(String[] args) {
		String input = "tact coa";
		System.out.println("its a palandrome permutation: "+palandromePermutation(input));

	}

}
