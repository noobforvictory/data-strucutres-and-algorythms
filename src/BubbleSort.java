
public class BubbleSort {
// in bubble sort we take the biggest element from the start and take it to the end by swapping
	public static void main(String[] args) {
		int[] arr= {7,8,1,3,2};
		for(int i=0; i<arr.length-1;i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if (arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		//output={1,2,3,7,8}

	}

}