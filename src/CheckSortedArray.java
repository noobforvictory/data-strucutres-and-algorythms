
public class CheckSortedArray {
	public static void checkSorted(int[] arr, int indx) {
		if(indx==arr.length-1) {
			System.out.println("array is sorted");
			return ;
		}
		if(arr[indx]>=arr[indx+1]) {
			System.out.println("arry is not sorted");
			return ;
		}else {
			checkSorted(arr,indx+1);
		}
	}

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		checkSorted(arr,0);

	}

}
