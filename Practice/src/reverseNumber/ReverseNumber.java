package reverseNumber;

public class ReverseNumber {

	public static int reverseNumber(int n) {
		int r,l=0;
		while(n>0) {
			r=n%10;
			l=l*10+r;
			n=n/10;
		}
		return l;
	}
}
