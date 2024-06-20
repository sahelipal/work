package boundaryAverage;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("no of records");
		int n=sc.nextInt();
		int[]number=new int[n];
		for(int i=0;i<n;i++) {
			number[i]=sc.nextInt();
		}
		float avg=UserMainCode.getBoundaryAverage(number);
		System.out.println("avg "+avg);
	}

}
