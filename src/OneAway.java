import java.util.HashSet;

public class OneAway {
	public static boolean oneEditAway(String str1, String str2) {
		if(str1.length()==str2.length()) {
			return oneEditReplace(str1,str2);
		}
		else if(str1.length()==str2.length()+1) {
			return oneEditInsert(str1,str2);
		}
		else if(str1.length()==str2.length()-1) {
		return	oneEditInsert(str2, str1);
			
		}
		return false;
}
	
		public static boolean oneEditInsert(String longer, String shorter) {
			int index1 = 0; 
			int index2 = 0; 
			while ( index2 <shorter.length()) { 
				if (longer.charAt(index1) != shorter.charAt(index2)) { 
					if(index1 != index2) { 
						return false; 
						} 
					index1++; 
					} else{ 
						index1++;
						index2++; 
						}
		  } return true;
		 
	}
	
	public static boolean oneEditReplace(String str1, String str2) {
		int operations =0;
		for(int i=0; i<str1.length(); i++) {
			if(!(str1.charAt(i)==str2.charAt(i)))operations++;
		}
		return operations<=1;
	}


	public static void main(String[] args) {
		String str1 ="pale";
		String str2= "ale";
		
		System.out.println("one edit away: "+oneEditAway(str1,str2));

	}
}
