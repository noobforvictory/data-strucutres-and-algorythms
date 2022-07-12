
public class PairingProblem {
public static int invitePeople(int n) {
	if(n<=1)return 1;
	
	return invitePeople(n-1) + (n-1)*invitePeople(n-2);
}
	public static void main(String[] args) {
		int n=4;
		System.out.println(invitePeople(n));

	}

}
