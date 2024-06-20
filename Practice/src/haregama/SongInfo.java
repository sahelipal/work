package haregama;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
public class SongInfo {
	private Map<String,Integer>songMap;
	
	public Map<String, Integer> getSongMap() {
		return songMap;
	}

	public void setSongMap(Map<String, Integer> songMap) {
		this.songMap = songMap;
	}
	public int findTheViewsForGivenSongTitle(String songTitle)
	{
		int views=0;
		for(Map.Entry<String,Integer>entries:songMap.entrySet()) {
			if(entries.getKey().equalsIgnoreCase(songTitle)) {
				views=entries.getValue();
			}
		}
		if(views>0) {
			return views;
		}
		else {
			return -1;
		}
	}
	public List<String>findTheSongWithHighestViews(){
		List<String>max=new ArrayList<>();
		int maxViews=Collections.max(songMap.values());
		for(Map.Entry<String,Integer>entries:songMap.entrySet()) {
			if(entries.getValue()==maxViews) {
				max.add(entries.getKey());
			}
		}
		return max;
	}
	public static void main(String[] args) {
		Map<String,Integer>map=new HashMap<>();
		SongInfo songInfo=new SongInfo();
		List<String>list1=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of records");
		int n=sc.nextInt();
		System.out.println("enter the records");
		String[]records=new String [n];
		sc.nextLine();
		for(int i=0;i<n;i++) {
			records[i]=sc.nextLine();
		}
		for(int i=0;i<n;i++) {
			String[]record=records[i].split(":");
			map.put(record[0],Integer.parseInt(record[1]));
			songInfo.setSongMap(map);
		}
		System.out.println("enter the song title");
		String songTitle=sc.nextLine();
		int view=songInfo.findTheViewsForGivenSongTitle(songTitle);
		if(view==-1) {
			System.out.println("views notv found");
		}else {
			System.out.println(view);
		}
		list1=songInfo.findTheSongWithHighestViews();
		if(list1!=null&&list1.size()>=0) {
			System.out.println("song with highest view is");
			for(String s:list1) {
				
				System.out.println(s);
			}
		}
		else {
			System.out.println("no highest view");
		}
	}

}
