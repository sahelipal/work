package UniqueNumber;
import java.util.*;
class UserMainCode{
public static  int getUnique(int n){

//	int count=0;
//	int temp=n;
//	while(temp!=0) {
//		temp=temp/10;
//		count++;
//	}
//	int[]num=new int[count];
//	temp=n;
//	int index=0;
//	while(temp>0) {
//		int digit=temp%10;
//		num[index++]=digit;
//		temp=temp/10;
//	}
//	for(int i=0;i<count;i++) {
//		for(int j=i+1;j<count;j++) {
//			if(num[i]==num[j]){
//				return -1;
//			}
//		}
	
	int count=0;
	int temp=n;
	while(temp>0) {
		temp=temp/10;
		count++;
	}
	
	temp=n;
	int[]num=new int[count];
	int index=0;
	while(temp>0) {
		num[index++]=temp%10;
		temp=temp/10;
	}
	for(int i=0;i<count;i++) {
		for(int j=i+1;j<count;j++) {
			if(num[i]==num[j]) {
				return -1;
			}
		}
	}
	return 1;	
	
}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
//		
    int result=UserMainCode.getUnique(n);

    if(result==-1) {
    	System.out.println("Not unique");
    }
    else {
    	System.out.println("Unique");
    }

}
}