

public class URLify {
public static String replaceSpace(String input) {
	char s=' ';
	int space = s;
	String newstr="";
	String replace = "%20";
	for(int i=0; i<input.length(); i++) {
		if(input.charAt(i)==space) {
			newstr +=replace;
		}
		else { newstr += input.charAt(i);}
		
	}
	return newstr;
}
	public static void main(String[] args) {
		String name ="Mr John Smith ";
		System.out.println(replaceSpace(name));
		
	}
}
