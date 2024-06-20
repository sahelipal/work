package PracCollection;
import java.util.ArrayList;
import java.util.List;
public class DemoCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>mylist=new ArrayList<String>();
		mylist.add("hi");
		mylist.add("HI");
		mylist.add("Hi");
		mylist.add("name");
		mylist.add("NAME");
	
		System.out.println(mylist);
		for(String x:mylist) {
			System.out.println(x);
		}
		System.out.println(mylist.size());
	}

}
