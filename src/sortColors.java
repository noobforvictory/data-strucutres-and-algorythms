import java.util.ArrayList;

public class sortColors {

	public static void main(String[] args) {
		//color read=0,blue=1, green=2
		int [] nums = {1,2,0,0,2,1,1}; 
		if(nums.length==0 || nums.length==1){return;}
	       int start=0;
	        int end=nums.length-1;
	        int index=0;
	        while(index<=end && start<end){
	      
	            if(nums[index]==0){
	                nums[index]=nums[start];
	                nums[start]=0;
	                start++;
	                index++;
	            }
	            else if(nums[index]==2){
	                nums[index]=nums[end];
	                nums[end]=2;
	                end--;
	            }
	            else{
	                index++;
	            }
	            //output={0,0,1,1,1,2,2}
	        }
		/*
		 * int[] nums = {1,1,2,2,0,1,0,0,}; ArrayList<Integer> arr = new ArrayList<>();
		 * for(int i=0; i<nums.length; i++){ if(nums[i]==0){
		 * 
		 * arr.add(nums[i]); }} for(int i=0; i<nums.length; i++){ if(nums[i]==1){
		 * 
		 * arr.add(nums[i]); } } for(int i=0; i<nums.length; i++){ if(nums[i]==2){
		 * 
		 * arr.add(nums[i]); } } for(int i=0; i<nums.length; i++){ nums[i]= arr.get(i);
		 * }
		 */
	}

}
