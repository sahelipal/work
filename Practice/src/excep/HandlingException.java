package excep;

public class HandlingException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int j=0;
		try {
			
			if(j==0) {
				throw new ArithmeticException("i don't want to print zero");
			}
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("something went wrong" +e);
		}
		System.out.println(j);
		System.out.println("bye");
	}

}
