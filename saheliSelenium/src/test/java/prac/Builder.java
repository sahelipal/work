package prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=new ArrayList<Integer>();
		list.add(10);
		list.add(40);
		list.add(20);
		list.add(20);
//		//Collections.reverse(list);
//		for(int i=list.size()-1;i>=0;i--) {
//			System.out.println(list.get(i));
//		}
		
		Set<Integer>set=new LinkedHashSet<Integer>(list);
		
		for(Integer num:set) {
			System.out.println(num);
		}
	}

}
