
import java.util.Scanner;

public class Arrays {
	   public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter size of the array");
		
		int size= scanner.nextInt();
		int [] nums= new int[size];
		for(int i=0; i<size; i++) {
			System.out.println("enter elements");
			nums[i]= scanner.nextInt();
		}
		
		   boolean isAscending = true;
		   for(int i=0; i<nums.length-1; i++) {
			   if(nums[i]>nums[i+1]) {
				   isAscending = false;
			   }
		   }
		   if (isAscending) {
			   System.out.println("its in ascendng order");
		   }
		   else{System.out.println("its in not in ascending order");}


	}

}
