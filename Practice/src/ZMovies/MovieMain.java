package ZMovies;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
public class MovieMain {
	private Map<String,Float>movieDetailsMap=new HashMap<>();
	
	public Map<String, Float> getMovieDetailsMap() {
		return movieDetailsMap;
	}

	public void setMovieDetailsMap(Map<String, Float> movieDetailsMap) {
		this.movieDetailsMap = movieDetailsMap;
	}
	
	public float findMovieRating(String movieName) {
		float rating=0;
		for(Map.Entry<String,Float>entries:movieDetailsMap.entrySet()) {
					if(entries.getKey().equalsIgnoreCase(movieName)) {
						rating=entries.getValue();
					}
		}
		if(rating>0) {
			return rating;
		}
		else {
			return -1;
		}
	}
	public List<String>findMoviesWithHighestRating(){
		List<String>highRating=new ArrayList<>();
		for(Map.Entry<String,Float>entries:movieDetailsMap.entrySet()) {
			if(entries.getValue()>4) {
				highRating.add(entries.getKey());
				return highRating;
			}
		}
		return highRating;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		MovieMain movieMain=new MovieMain();
		Map<String,Float>map=new HashMap<>();
		List<String>list1=new ArrayList<>();
		System.out.println("Enter the number of records to be added");
		int n=sc.nextInt();
		System.out.println("Enter the Movie records(Movie Name:Rating)");
		String[]movieDetails=new String[n];
		sc.nextLine();
		for(int i=0;i<n;i++) {
			movieDetails[i]=sc.nextLine();
		}
		
		for(int i=0;i<movieDetails.length;i++) {
			String[]movieDetail=movieDetails[i].split(":");
			map.put(movieDetail[0], Float.parseFloat(movieDetail[1]));
			movieMain.setMovieDetailsMap(map);
		}
		System.out.println("Enter the movie name to be searched:");
		String movieName=sc.nextLine();
		float rating=movieMain.findMovieRating(movieName);
		if(rating==-1) {
			System.out.println(movieName+" is an invalid movie name");
		}
		else {
			System.out.println(rating);
		}
		
		
		
		list1=movieMain.findMoviesWithHighestRating();
		if(list1!=null && list1.size()>=1) {
		for(String str:list1) {
			System.out.println("Highest Rating movie name:");
			System.out.println(str);
		}
		}
		else {
			System.out.println("no movies found");
		}

	}

}
