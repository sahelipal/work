package largestSpan;

public class UserMainCode {
	public static int getLargestSpan(int[]number) {
		int gap=0,max=0;
	for(int i=0;i<number.length;i++) 
	{
		for(int j=i+1;j<number.length;j++) {
			if(number[i]==number[j]) {
				gap=j-i;
			}
		}
		if(gap>max) {
			max=gap;
		}
	}
	
	return max+1;
	}
}
