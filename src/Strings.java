import java.util.Scanner;
public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc= new Scanner(System.in);
        
			/*TO REPLACE 'e' IN A STRING TO I USE THE BELOW CODE
			 * System.out.println("enter a String")
			 * String orignal = sc.nextLine(); String result=""; for(int i =0;
			 * i<orignal.length(); i++) { if(orignal.charAt(i)=='e') { result = result +'i';
			 * } else { result = result + orignal.charAt(i); } } System.out.println(result);
			 */
         System.out.println("enter ur email");
         String email = sc.nextLine();
         int end =0;
         for(int i =0; i<email.length(); i++) {
        	 if(email.charAt(i)=='@') {
        		end =i; 
        	 }
         }
         System.out.println("ur username is "+email.substring(0, end));
	}
	
}
