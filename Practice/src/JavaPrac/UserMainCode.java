package JavaPrac;

public class UserMainCode {
	public static int compareLastWords(String str) {
		String []arr=str.split(" ");
		int x=arr[0].length();
		int n=arr.length-1;
		int y = arr[n].length();
//		if(x==y) {
//			return x;
//		}
//		else {
//		return x+y;
//		}
		if(arr[0].equalsIgnoreCase(arr[n])|| (x==y)) {
			return x;
		}
		else if(x!=y) {
			return x+y;
		}
		else {
			return x+y;
		}
		
	}
}
