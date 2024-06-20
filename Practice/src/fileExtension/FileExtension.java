package fileExtension;
import java.util.*;
public class FileExtension {
	private static String getFileExtension(String str) {
		int dotindex=str.lastIndexOf(".");
		if(dotindex!=-1 && dotindex<str.length()-1) {
			return str.substring(dotindex+1);
		}else {
			return "no extension found";
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter file name");
		String filename=sc.nextLine();
		String sub=getFileExtension(filename);
		System.out.println(sub);
		
	}

}
