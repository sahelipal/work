package CharacterCleaning;

public class UserMainCode {
	public  static String removeCharacter(String str,char character) {
	
//		String result="";
//		
//		for(int i=0;i<str.length();i++) {
//			if(str.charAt(i)!=character) {
//				
//				result+=str.charAt(i);
//			}
//
//		}
		
		
		
//		String result=str.replace(String.valueOf(character),""); this is for case insensitive
		
		String result="";
		
		for(int i=0;i<str.length();i++) 
		{
			char currentChar=str.charAt(i);
			if(Character.toUpperCase(currentChar)!=Character.toUpperCase(character)
					&& Character.toLowerCase(currentChar)!=Character.toLowerCase(character)) {
				
				result+=str.charAt(i);
			}

		}
		
		return result;
	}
}

