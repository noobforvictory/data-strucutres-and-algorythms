import java.util.Scanner;

public class StrintBuilder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       // reversing a String using StringBuilder
		System.out.println("enter name");
       String name =sc.nextLine();
       StringBuilder sb = new StringBuilder(name);
       for(int i=0; i<sb.length()/2; i++) {
    	   int front=i;
    	   int back = sb.length()-1-i;
    	   char frontchar = sb.charAt(front);
    	   char backchar = sb.charAt(back);
    	   sb.setCharAt(front, backchar);
    	   sb.setCharAt(back, frontchar);
    	   
       }
       System.out.println(sb);
       
	}

}
