package Interview;

public class Main {

	public static void main(String[] args) {
		int a=5;
		int b=0;
		if(a>b) {
			try{
				throw new MyException();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
