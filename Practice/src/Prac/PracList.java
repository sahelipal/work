package Prac;
import java.util.*;
import java.util.HashSet;
import java.util.ArrayList;

public class PracList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the line");
      String str=sc.nextLine();
      String[]words=str.split("[,;:.?!\\s]+");
      
      for(int i=0;i<words.length;i++) {
    	  words[i]=words[i].toLowerCase();
      }
      System.out.println("Number Of Words");
      System.out.println(words.length);
      HashSet<String>words_set=new HashSet<String>();
      for(String element:words) {
    	  words_set.add(element);
      }
      System.out.println("Number of Unique Words");
      System.out.println(words_set.size());
      System.out.println("The words are");
      ArrayList<String>words_list=new ArrayList<>(words_set);
      
    	  for(int j=0;j<words_list.size();j++) {
    		  System.out.println((j+1)+"."+words_list.get(j));
    	  }
      
//      int[] serial_no = {1,2,3};
//      String[] geeks =  words_set.toArray(new String[words_set.size()]);
//      System.out.println(serial_no[0]+geeks[0]);
      //int[] arr3 = {1,2,3};
//      for(int serial=1;serial<words_set.size();serial++) {
//      System.out.println(serial+"."+words_set);
//      }
    	  //hello Hello HEllo hi hi: hi! Welcome,   welcome
      
	}

}
