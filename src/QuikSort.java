
public class QuikSort {
	public static int partition(int[]arr, int low, int high) {
		int i=low-1;
		int pivot=arr[high];
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		i++;
		int temp=arr[high];
		arr[high]=arr[i];
		arr[i]=temp;
		return i;
	}
	public static void quickSort(int[]arr, int low, int high) {
		if(low<high) {
		int pivotIdx=partition(arr,low,high);
		quickSort(arr,low,pivotIdx-1);
		quickSort(arr,pivotIdx+1,high);
		}
	}

	public static void main(String[] args) {
		int[]arr= {2,4,3,7,4,8,5,1};
		quickSort(arr,0,arr.length-1);
for(int i=0;i<arr.length; i++) {
	System.out.print(arr[i]+" ");
}
	}

}
