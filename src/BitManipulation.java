import java.util.Scanner;

public class BitManipulation {
	public static void updateBit(int n, int pos, int oper) {
		int bitMask = 1<<pos;
		if(oper==0) {
			int newNumber = ~(bitMask) & n;
			System.out.println(newNumber);
		}
		else {
			int newNumber = bitMask | n;
			System.out.println(newNumber);
		}
		
	}
	public static void clearBit(int n, int pos) {
		int bitMask = 1<<pos;
		int newNumber = ~(bitMask) & n;
		System.out.println(newNumber);
	}
	public static void setBit(int n, int pos) {
		int bitMask= 1<<pos;
		int newNumber = bitMask | n;
		System.out.println(newNumber);
	}
public static void getBit(int n, int pos) {
	int bitMask= 1<<pos;
	if( (bitMask & n) ==0) {
	System.out.println("bit was zero");
	}
	else {
		System.out.println("bit was 1");
	}
	
	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
        int n = sc.nextInt();
        System.out.println("enter position");
        int pos= sc.nextInt();
        System.out.println("enter operaator");
        int oper = sc.nextInt();
        getBit(n,pos);
        clearBit(n,pos);
        setBit(n,pos);
        updateBit(n,pos,oper);
	}

}
