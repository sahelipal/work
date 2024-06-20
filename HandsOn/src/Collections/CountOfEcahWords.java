package Collections;
import java.util.*;
import java.util.HashMap;
import java.util.TreeMap;
public class CountOfEcahWords {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		String []words=str.split("[^\\w'-]+");//!?,.' 
		for(int i=0;i<words.length;i++) {
			words[i]=words[i].toLowerCase();
		}
		
		List<String>list=Arrays.asList(words);
	// Collections.sort(list);
		Map<String,Integer>count=new HashMap<>();
//		for(String element:list) {
//			count.put(element, count.getOrDefault(element, 0)+1);
//		}
		
		for(String element:list) {
			//count.put(element, count.getOrDefault(element, 0)+1);
			int freq = Collections.frequency(list,element);
			count.put(element,freq);
		}
		
		
		TreeMap<String,Integer>sortedMap=new TreeMap<>(count);
		for(Map.Entry<String, Integer>entry:sortedMap.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}

}
