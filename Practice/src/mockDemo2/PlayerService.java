package mockDemo2;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
public class PlayerService {
	
	public boolean removeKey(Map<String, Integer> map, String key) {

		if(map.containsKey(key)) {

			map.remove(key);

			return true;

		}

		else

			return false;

	}

	public Map<String,Integer>  getCountryPlayers(List<Player> players) {
		  // fill up code here
		// return { "India":5 , "England":3 }
			Map<String, Integer> map = new HashMap<>();
			for(Player p:players)
			{
				if(map.containsKey(p.getCountry())) {
					Integer value = map.get(p.getCountry())+1;
					map.put(p.getCountry(), value);
				}
				else 
				{
					map.put(p.getCountry(), 1);
				}
			}
			return map;
	}
	
	public boolean getPlayer(List<Player> players, String playerName) throws Exception {

		   boolean found =false;

		   // fill the code here

		  // if playername is found in given list, return true 

	     //  otherwise throw an exception with message "player not found"

		   for(Player p:players) {

			   if(p.getName().equals(playerName)) {

				   found=true;

				   break;

			   }

		   }

		   if(found)

		      return found;

		   else

			   throw new Exception("player not found");

	   }
	public int countNoOfPlayers( List<Player> players , String countryName) {
		   int count=0;
		   // fill code , if there is no player for that country, return -1 , check is case sensitive
		   for(Player p:players) {
			   if(p.getCountry().equals(countryName))
				   count++;
		   }
		   if(count!=0) {
		   return count;
		   }else {
			  return -1; 
		   }
	   }
	public List<String> getPlayerNames(List<Player> players, int minRun, int maxRun){
		   List<String> playerList = null;
		   // fill code here it will return name of players who have run between minRun and maxRun
		   playerList = new ArrayList<>();
		   for(Player p:players) {
			   if(p.getTotalRun()>=minRun && p.getTotalRun()<=maxRun)
				   playerList.add(p.getName());
		   }
		   return playerList;
	   }
		//Sachin:India:230:23
		public Player makePlayer(String data) throws Exception{
			//Sachin:India:230:23
			Player player=null;
			//fill code
			String a[] = data.split(":");
			if(!a[0].matches("^[A-Z]{1}[a-zA-z ]{1,}$"))
				   throw new Exception("Data not proper");
			if(!a[1].matches("^[a-zA-z]{1,}$"))
				   throw new Exception("Data not proper");
			if(!a[2].matches("^[0-9]{1,}$"))
				   throw new Exception("Data not proper");
			if(!a[3].matches("^[0-9]{1,}$"))
				   throw new Exception("Data not proper");
			if( Integer.parseInt(a[2])<0 || Integer.parseInt(a[3])<0)
				throw new Exception("Data not proper");
			player = new Player(a[0], a[0], Integer.parseInt(a[2]), Integer.parseInt(a[3]));
			return player;
		}
	
	public static void main(String[] args) {
		

	}

}
