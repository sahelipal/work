package oops;
import java.util.*;
class Bhakti{
	int l,b,h;
	Bhakti(){
		this.l =0;
		this.b =0;
		this.h =0;
	}
	
	Bhakti(int l,int b,int h){
		this.l =l;
		this.b =b;
		this.h =h;
	}
	
}
		
class Saheli extends Bhakti{
	int weight;
	int sum = 0;
	Saheli(){
		this.weight = 0;
	}
	
	Saheli(int l){
		this.l = l;
	}
	
	Saheli(int l,int b,int h,int weight){
		super(l,b,h);
		this.weight = weight;
	}
	int sum() {
		sum = l+b+h+weight;
		return sum;
	}
}






public class SumOfVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 nos");
		int l=sc.nextInt();
		int b=sc.nextInt();
		int h=sc.nextInt();
		int weight=sc.nextInt();
		Saheli sh = new Saheli(l,b,h,weight);
		System.out.println(sh.sum());

	}

}
