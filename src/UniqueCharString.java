
public class UniqueCharString {
	public static boolean checkUniqueness(String name) {
		if(name.length()>128) {
			return false;
		}
		boolean[] char_set = new boolean [128];
		for(int i =0; i<name.length(); i++) {
			int val = name.charAt(i);
			if(char_set[val]) {return false;}
			else { char_set[val]=true;}
			
		}
		return true;
	}

	public static void main(String[] args) {
		String name = "denis";
		System.out.println("the String is unique: "+checkUniqueness(name));
		
	}

}
