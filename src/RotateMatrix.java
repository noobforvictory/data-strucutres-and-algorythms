
public class RotateMatrix {
	public static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println();
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]);
			}
		}
	}

	public static void rotateArray(int[][] arr) {
		int n = arr.length;
		// transpose matrix
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n / 2; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[i][n - j - 1];
				arr[i][n - j - 1] = temp;
			}
		}
		printArray(arr);
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, },
				{ 4, 5, 6 },
				{ 7, 8, 9 } };
		printArray(arr);
		System.out.println();
		rotateArray(arr);

	}

}
