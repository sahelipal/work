package STRINGFINDER;

public class UserMianCode {
	public static int  stringFinder(String str,String str1,String str2) 
	{
		if(str.contains(str2)&&str.contains(str1)) {
			int pos1=str.indexOf(str1);
			int pos2=str.indexOf(str2);
			if(pos2>pos1) {
				return 1;
			}else {
				return 2;
			}
		}else {
			return 0;
		}
	}
}
