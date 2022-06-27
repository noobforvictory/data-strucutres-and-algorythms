import java.util.Scanner;
public class twoDArrays {
	public static void transpose(int [][] nums, int rows , int columns) {
		int[][] transpose= new int[columns][rows];
		for(int i =0; i<columns; i++) {
			System.out.println();
			for(int j=0; j<rows; j++) {
				System.out.print(nums[j][i]+" ");
			}
		}
	}
	public static void spiralOrder(int[][] nums, int rows,int  columns) {
		for(int i=0; i<rows; i++) {
			if(i%2==0) {
				for(int j =0; j<columns; j++) {
					System.out.print(nums[i][j]);
				}
			}
			else {
				for(int j=columns-1; j>=0; j--) {
					System.out.print(nums[i][j]);
				}
			}
		}

	}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter rows");
		int rows = scanner.nextInt();
		System.out.println("enter colums");
		int columns= scanner.nextInt();
		int[][] nums = new int[rows][columns];
		for(int i=0; i<rows; i++) {
			System.out.println();
			for(int j=0; j<columns; j++) {
				System.out.println("enter elements");
				nums[i][j]= scanner.nextInt();
				
			}
		}
		  //spiralOrder(nums,rows,columns);
		  transpose(nums, rows , columns);
	}
}
