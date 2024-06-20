package boundaryAverage;

public class UserMainCode {
	public static float getBoundaryAverage(int[]number) {
		int max=number[0];
		int min=number[0];
		for(int i=0;i<number.length;i++) {
			if(number[i]>max) {
				max=number[i];
			}
		}
		
		for(int i=0;i<number.length;i++) {
			if(number[i]<min) {
				min=number[i];
			}
		}
		 float avg=(float)(max+min)/2;
		return avg;
	}
}
