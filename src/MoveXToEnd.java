
public class MoveXToEnd {
 public static String strX="";
 public static String strAlp="";
public static void moveX ( String str , int i ) {
	if ( i == str.length()) {
		System.out.println((strAlp + strX));
		return;
	}
	if(str.charAt(i)=='x') {
		strX += str.charAt(i);
		
	}else {
		strAlp += str.charAt(i);
		
	}
	moveX( str , ++i);
}
	public static void main(String[] args) {
		String str ="axbcxxd";
		int i=0;
		
		moveX(str , i);
	}

}
