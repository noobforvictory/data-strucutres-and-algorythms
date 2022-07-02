
public class StringCompression {
public static String compressedString(String str) {
	StringBuilder sb = new StringBuilder();
	int count = 0;
	for( int i=0; i<str.length();i++) {
		count++;
		if(i+1>=str.length() || str.charAt(i)!=str.charAt(i+1)) {
			sb.append(str.charAt(i));
			sb.append(count);
			count =0;
		}
	}
	int j=0;
	int sum=0;
	for(int i=1; i<sb.length(); i+=2) {
		int val = Character.getNumericValue(sb.charAt(i)); 
		sum += val;
		j++;
	}
	if(j==sum) {
		return str;
	} else {
		return sb.toString();
	}
	
}
	public static void main(String[] args) {
		String str = "abcd";
		System.out.println("compressed string : "+compressedString(str));
	}

}
