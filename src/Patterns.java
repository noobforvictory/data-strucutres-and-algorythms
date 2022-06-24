
public class Patterns {
	public static void palandromicPyramid( int n) {
		for(int i=1; i<=n; i++) {
			System.out.println();
			for(int j=5; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {
				System.out.print(i-j);
			}
			for(int j=2; j<=i; j++) {
				System.out.print(j);
			}
		}
	}
	public static void printNumberPyramid(int n) {
		for(int i=1; i<=n; i++) {
			System.out.println();
			for(int j=5; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
		}
	}
	public static void printRombus(int side) {
		for(int i =1; i<=side; i++) {
			System.out.println();
			for(int j=5; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=side; j++) {
				System.out.print("* ");
			}
		}
	}
	public static void printBinaryTriangle(int n){
		for(int i=1; i<=n; i++) {
			System.out.println();
			
			for(int j=1; j<=i; j++) {
			int sum = i + j;
			if (sum%2==0) {
				System.out.print("1 ");
			}
			else {
				System.out.print("0 ");
			}
			}
		}	
	}
	public static void printFloydsTriangle(int n) {
		int number=1;
		for(int i=1; i<=n; i++) {
			System.out.println();
			for(int j=1; j<=i; j++) {
				System.out.print(number+" ");
				number++;
			}
		}
		
		
	}
	public static void invertedPyramidWithNumbers(int num) {
		for(int i=num; i>=1; i--) {
			System.out.println();
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
				
		}
	}
	public static void printHollowRectangle(int n, int m) {
	// tracing the boundry loop
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				if(i==1||j==1||i==n||j==m) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}	
	}
	
	
	
	
	public static void printChristmassTree(int height) {
		for(int i=0; i<height; i++) {
			System.out.println();
			printSpace(height-i);
			printStars(i+1);
			printStars(i);
		}
		for(int i=0; i<2; i++) {
			System.out.println();
			printSpace(height-1);
			printStars(3);
		}
	}
	public static void printRightAngledTriangle(int num) {
		for (int i=0; i<num; i++) {
			System.out.println();
			printSpace(num-i);
			printStars(i+1);
			
		}
	}
	public static void printSpace(int num) {
		for(int i =0; i<num; i++) {
			System.out.print(" ");
		}
	}
	public static void printTriangle(int num) {
		for(int i = 0; i<= num; i++) {
			System.out.println();
			printStars(i);
		}
	}
	public static void printStars(int num) {
		for(int i =0; i<num; i++) {
			System.out.print("*");
		}
	}
	public static void printSquare(int num) {
		for(int i =0; i<num; i++) {
			System.out.println();
			printStars(num);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
          printStars(4);
          System.out.println();
          printSquare(4);
          printTriangle(4);
          printRightAngledTriangle(4);
          printChristmassTree(4);
          System.out.println();
          printHollowRectangle(4,6);
          invertedPyramidWithNumbers(5);
         
          printFloydsTriangle(5);
          printBinaryTriangle(5);
          printRombus(5);
          printNumberPyramid(5);
          palandromicPyramid(5);
	}

}
