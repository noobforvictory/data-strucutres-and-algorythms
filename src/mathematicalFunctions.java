import java.util.Scanner;
public class mathematicalFunctions {
	public static void fibonacci(int n) {
		int num1=0;
		int num2=1;
		int counter=0;
		while(counter<n) {
			System.out.print(num1+" ");
			int num3= num1 + num2;
			num1=num2;
			num2=num3;
			counter=counter+1;
		}
	}
	public static int greatestDiviser(int a ,int b) {
		int n=0;
		int diviser=0;
		if(a-b>0) {
			n=a;
		}
		else { 
			n=b;
		}
		for(int i=1; i<n; i++) {
			if(a%i==0 && b%i==0) {
				 diviser =i;
			}
		}
		  return diviser;
	}
	
public static String checkPrime(int n) {
	 String check="";
	for(int i=2; i<n; i++) {
		
		if(n%i==0 ) {
			return check ="its not prime";
		}
	}
	     return check = "its  prime";
}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number ");
		int n = scanner.nextInt();
         fibonacci(n);
	}

}
