
public class Patterns {
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
	}

}
