package stringBuilder;

public class Builder {

	public static void main(String[] args) {
		String s="welcome";
		StringBuilder sb= new StringBuilder(s);
		//sb.append("saheli");
		//sb.insert(7,",");
		//sb.delete(3,4);//delete only 4th char
		//sb.delete(3, 5);
		//sb.deleteCharAt(1);//starting index 0
//		boolean result=false;
//		String tr=sb.reverse().toString();
//		if(tr.equals(s)) {
//			result=true;
//			System.out.println(result);
//		}else {
//			result=false;
//			System.out.println(result);
//		}
//		System.out.println(sb);
		char[]arr=new char[7];
		sb.getChars(0,5, arr, 0);//o.p welco 5 th index is excluded
		for(char c:arr) {
			System.out.println( c);
		}

	}

}
