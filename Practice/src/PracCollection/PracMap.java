package PracCollection;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.HashMap;
 

class Student{
	int age;
	String name;

	public Student(int age, String name) {
		
		this.age = age;
		this.name = name;
	}

	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
}


public class PracMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Comparator<Student> com=new Comparator<Student>() 
	{
		public int compare(Student i,Student j) 
		{
			if(i.age>j.age) {
				return 1;
			}
			else {
				return -1;
			}
		}
	};
		List<Student>num=new ArrayList<>();
		num.add(new Student(21,"saheli"));
		num.add(new Student(28,"bhakti"));
		num.add(new Student(25,"soham"));
		num.add(new Student(23,"arijit"));
		Collections.sort(num,com);
		for(Student s:num) {
		System.out.println(s);
		}
		}
	}


