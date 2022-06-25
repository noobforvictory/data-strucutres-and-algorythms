
public class Patterns {
	public static void pascalsTriangle(int n) {
		for(int i=0; i<n; i++) {
			System.out.println();
			for(int j=n; j>=i; j--) {
				System.out.print(" ");
			}
			
				int m = (int)Math.pow(11, i);
				System.out.print(m);
			
		}
	}
	public static void invertedHalfPyramid(int n) {
		for(int i=1; i<=n; i++) {
			System.out.println();
			for(int j=n; j>=i; j--) {
				System.out.print(i);
			}
		}
	}
	public static void halfPyramid(int n) {
		for(int i=1; i<=n; i++) {
			System.out.println();
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
		}
	}
	public static void printHollowRombus(int n) {
		for(int i=1; i<=n; i++) {
			System.out.println();
			for(int j=5; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=n; j++) {
				if(i==1||i==n) {
					System.out.print("*");
				}
			     else if(j==1||j==n) {
					 System.out.print("*");
				 }
				 else {
					 System.out.print(" ");
				 }
			}
		}
	}
	public static void printButterfly(int n) {
		for(int i=1; i<=n; i++) {
			System.out.println();
			for(int j=1; j<=i; j++) {
				
					System.out.print("*" );
				
			}	
				for(int j=1; j<=2*(n-i); j++) {
					System.out.print(" ");
				
			}
				for(int j=1; j<=i; j++) {
					
					System.out.print("*");
				
					
			}
		}
		for(int i=n; i>=1; i--) {
			System.out.println();
			for(int j=1; j<=i; j++) {
				
					System.out.print("*");
				
				
			}	
				for(int j=1; j<=2*(n-i); j++) {
					System.out.print(" ");
				
			}
				for(int j=1; j<=i; j++) {
					
						System.out.print("*");
					
				}
		}
	}
	public static void printDiamond(int n) {
		for(int i =1; i<=n; i++) {
			System.out.println();
			for(int j =n; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
		}
		for(int i =n; i>=1; i--) {
			System.out.println();
			for(int j =n; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			
		}
	}
	public static void printHollowButterfly( int n) {
		for(int i=1; i<=2*n; i++) {
			System.out.println();
			for(int j=1;j<=2*n; j++) {
           if(j==1||j==2*n||j==i||j==(2*n-i+1)) {
        	   System.out.print("*");
           }
           else {
        	   System.out.print(" ");
           }
			}
		}
		
		
	}
			public static void palandromicPyramid( int n) {
		for(int i=1; i<=n; i++) {
			System.out.println();
			for(int j=n; j>i; j--) {
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
          printButterfly(4);
          printDiamond(4);
          printHollowButterfly(4);
          printHollowRombus(5);
          halfPyramid(5);
          invertedHalfPyramid(4);
          pascalsTriangle(6);
	}

}
