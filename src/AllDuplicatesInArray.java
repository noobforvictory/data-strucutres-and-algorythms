import java.util.ArrayList;

public class AllDuplicatesInArray {

	public static void main(String[] args) {
		   int[] nums = { 4,3,2,7,8,2,3,1}; 
		       ArrayList<Integer> arr = new ArrayList<>();
		        for(int i=0; i<nums.length; i++){
		         int index=Math.abs(nums[i])-1;
		            if(nums[index]<0){
		                arr.add(index+1);
		            }
		        else{
		           nums[index]= -nums[index];
		               }
		        }
		       //output = arr
		    
	}

}
