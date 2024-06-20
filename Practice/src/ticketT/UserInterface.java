package ticketT;
import java.util.List;
import java.util.ArrayList;
public class UserInterface {
	public static List<TicketInfo> getTickets(String seatType , List<TicketInfo> sourceList) {
		List<TicketInfo> list = new ArrayList<>();
		for(TicketInfo t: sourceList) {
			if(t.getSeatType().equals(seatType)) {
				list.add(t);
			}
		}
		return list;
//		return sourceList.stream().filter(t->t.getSeatType().equals(seatType)).toList();
	}
		
	public static int countTickets(String seatType , List<TicketInfo> list) 
	{
		int count=0;
		for(TicketInfo t:list) 
		{
		if(t.getSeatType().equals("Sleeper"))
		{
			count=count+t.getNoOfTickets();
		}
		
		}
		if(count>0) {
		return count;
		}else
		{
			return 0;
		}
	}	
 public static TicketInfo getDetails(String ticketDetails) {
			//Raj:2:General:8879678456:yes
			String[] de=ticketDetails.split(":");
			if(de.length==5) {
				return new TicketInfo(de[0],Integer.parseInt(de[1]),de[2],de[3],de[4]);
			}else {
				return null;
			}
//			TicketInfo ticketInfo=new TicketInfo(de[0],Integer.parseInt(de[1]),de[1],de[1],de[1]);
//				return ticketInfo;
			
	}
 public static List<TicketInfo> getAllTicketInfo( String ticketDetails[]){
		//{"Raj:2:General:8879678456:yes","Raja:1:Sleeper:8879678456:yes","Rajat:3:General:8879678456:No"}
		List<TicketInfo>  list = new ArrayList<>();
		for(String data:ticketDetails) {
			TicketInfo ticket = getDetails(data);
			list.add(ticket);
		}
		return list;
	}
	
	public static void main(String[] args) {
		
		
	}

}
