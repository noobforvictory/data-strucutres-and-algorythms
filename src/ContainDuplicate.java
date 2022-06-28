import java.util.HashSet;

public class ContainDuplicate {
	public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer>numbers = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){

        if(numbers.contains(nums[i])){
            return true;
        }
            else{
                numbers.add(nums[i]);
            }
        }
        return false;
    }

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,1};
       containsDuplicate(nums);
	}

}
