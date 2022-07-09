
public class FindOccurance {
	public static int first = -1;
	public static int last = -1;
	public static void findOccurance(String str, int indx, char element) {
		if(indx == str.length()-1) {
			System.out.println("first occurance at "+first);
			System.out.println("last occurance at "+last);
			return;
		}
		if(str.charAt(indx)==element) {
			if(first== -1) {
				first=indx;
			}else {
				last=indx;
			}
		}
		findOccurance(str,indx+1,element);
	}

	public static void main(String[] args) {
		String str= "abaacdaefaah";
		findOccurance(str,0,'a');

	}

}
