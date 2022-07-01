
public class CheckPermutations {
	public static boolean checkPermutation( String str1, String str2) {
		if(str1.length()!=str2.length())return false;
		int arr[] = new int [128];
        for(int i =0; i<str1.length(); i++) {		
        	int val = str1.charAt(i);
        	arr[val]++;
        }
        for(int i=0; i<str2.length(); i++) {
        	int val = str2.charAt(i);
        	arr[val]--;
        	if(arr[val]<0)return false;
        }
        return true;
	}

	public static void main(String[] args) {
		String[][] str = {{"abcda", "dabdc"}, {"efgh", "hgfe"}, {"sdwdd", "ddjwd"}};
		
		for(int i=0; i<str.length; i++) {
			String word1= str[i][0];
			String word2 = str[i][1];
			System.out.println(word1+" and "+word2+" are permutations: "+checkPermutation(word1,word2));
		}

	}

}
