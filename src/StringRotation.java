
public class StringRotation {
	 public static boolean rotateString(String s, String goal) {
	        if(s.length()!=goal.length())return false;
	       String newString ="";
	        newString = goal + goal;
	        if(newString.contains(s))return true;
	        else return false;
	    }
	
	public static void main(String[] args) {
	String s = "abcde";
	String goal = "cdeab";
	System.out.println(rotateString(s, goal));
	}

}
