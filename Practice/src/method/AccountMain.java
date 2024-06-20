package method;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account accobj=new Account();
		accobj.setAcc_no(1234);
		accobj.setName("saheli");
		accobj.setAmount(5000);
		
		System.out.println(accobj.getAcc_no());
		System.out.println(accobj.getName());
		System.out.println(accobj.getAmount());
	}

}
