package removeMultiples;
import java.util.*;
import java.util.List;
import java.util.ArrayList;
public class RmoveMultiples {
	public static List<Integer> removeThreeMultiples(int up) {
		List<Integer>list=new ArrayList<>();
		for(int i=1;i<=up;i++) {
			if(i%3!=0) {
			list.add(i);
			
			}
		}
		return list;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int up=sc.nextInt();
		List<Integer>list=removeThreeMultiples(up);
		for(Integer n:list) {
			System.out.println(n);
		}
	}

}
