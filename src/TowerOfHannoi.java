
public class TowerOfHannoi {
	public static void towerOfHannoi(int n, String src, String helpr, String destn) {
		if(n==1) {
			System.out.println("transfer disk "+n+" from "+src+" to "+destn);
			return;
		}
		towerOfHannoi(n-1, src,destn, helpr);
		System.out.println("transfer disk "+n+" from "+src+" to "+destn);
		towerOfHannoi(n-1,helpr,src,destn);
	}

	public static void main(String[] args) {
		int n =3;
		towerOfHannoi(n,"A","B","c");

	}

}
