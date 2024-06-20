package PracCollection;
import java.util.*;
import java.util.List;
import java.util.Map;
public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Bazaar bazaar=new Bazaar();
		System.out.println("Enter the no of policies");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
		System.out.println("Enter the policy id:");
		int policyId=sc.nextInt();
	
		System.out.println("Enter the policy name:");
		String policyName=sc.nextLine();
		bazaar.addPolicyDetails(policyId, policyName);
		}
		Map<Integer,String> policyMap=bazaar.getPolicyMap();
		for(Integer key:policyMap.keySet()) {
			System.out.println(key+":"+policyMap.get(key));
		}
		System.out.println("Enter the policy type to be searched");
		String policyType=sc.nextLine();
		List<Integer> policies=bazaar.searchBasedOnPolicyType(policyType);
		for(int policy:policies) {
			System.out.println(policy);
		}
	}

}
