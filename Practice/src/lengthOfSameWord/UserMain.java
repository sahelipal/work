package lengthOfSameWord;

public class UserMain {
	public static int compare(String str) {
		String[]arr=str.split(" ");
		int n=arr.length-1;
		int x=arr[0].length();
		int y=arr[n].length();
		if(x==y) {
			return x;
		}else {
			return x+y;
		}
	}
}
