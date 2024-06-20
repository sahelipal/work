package validate;
import java.util.*;
public class time {
	public static boolean isVlidTime(String input) 
	{
		String[]parts=input.split("[:\s]+");
		
		if(parts.length!=3) 
		{
			return false;
		}
		else 
		{
			int hours=Integer.parseInt(parts[0]);
			int minutes=Integer.parseInt(parts[1]);
			String sm=parts[2];
			
			if(hours>=0 && hours<12 && minutes>=0 && 	minutes<60) 
			{
				if(sm.equalsIgnoreCase("am")||sm.equalsIgnoreCase("pm") ) 
				{
				return true;
				}
			
				else 
				{
					return false;
				}
			}
			else 
			{ 
				return false;
			}
		}
		}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		boolean result=isVlidTime(input);
		
		if(result==true) {
			System.out.println("validate time");
		}else {
			System.out.println("invalid");
		}
	}

}
