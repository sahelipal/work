package method;

public class Account {
	private int acc_no;
	private String name;
	private double amount;
//	//setter
//	void setaccno(int accno) {
//		acc_no=accno;
//	}
//	//getter
//	int getaccno() {
//		return acc_no;
//	}
	public int getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
}
