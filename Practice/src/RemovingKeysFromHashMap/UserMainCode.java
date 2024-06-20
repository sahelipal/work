package RemovingKeysFromHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
public class UserMainCode {

	public static int sizeOfResultandHashMap(HashMap<Integer,String>hm) {
		List<Integer>keys=new ArrayList<>();
		for(Map.Entry<Integer,String>entries:hm.entrySet()) {
			if(entries.getKey()%4==0) {
				keys.add(entries.getKey());
				//return hm.size();
			}
		}
		for(Integer key:keys) {
		hm.remove(key);
		}
		return hm.size();
	}

}
