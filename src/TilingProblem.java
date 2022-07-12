
public class TilingProblem {
public static int placeTiles(int n, int m) {
	if(n<m)return 1;
	 if(n==m)return 2;
	return placeTiles(n-1,m) + placeTiles(n-m,m);
}
	public static void main(String[] args) {
		int n = 4;
		int m = 2;
		System.out.println(placeTiles(n,m));
	}

}
