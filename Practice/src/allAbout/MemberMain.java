package allAbout;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;
	
public class MemberMain {
	private Map<String,String>memberMap;
	
	public Map<String, String> getMemberMap() {
		return memberMap;
	}
	public void setMemberMap(Map<String, String> memberMap) {
		this.memberMap = memberMap;
	}
	public String findMemberTypeOfGivenMemberId(String memberId) {
		String id="Invalid member Id";
		for(Map.Entry<String,String>entries:memberMap.entrySet()) {
			if(entries.getKey().equals(memberId)) {
				id=entries.getValue();
		}
		}
		return id;
		
	}
	public List<String>findMemberIds(String memberType){
		List<String>list=new ArrayList<>();
		for(Map.Entry<String,String>entries:memberMap.entrySet()) {
		if(memberType.equalsIgnoreCase(entries.getValue())) {
			list.add(entries.getKey());
		}
		}
		return list;
	}
	public static void main(String[] args) {
		
	}

}
