package BookShop;
import java.util.*;

public class UserInterface {
	public static Book extractDetails(String bookDetails) {
		String[] details=bookDetails.split(":");
		if(details.length==4) {
			return new Book(details[0],details[1],Integer.parseInt(details[2]),Double.parseDouble(details[3]));
		}else {
			return null;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the book details");
		String bookDetails=sc.nextLine();
		Book book=extractDetails(bookDetails);
		double cost=book.calculateBookCost();
		if(cost==0||cost<0) {
			System.out.println("INVALID DETAISL");
		}else {
		System.out.println("Book Name: "+book.getBookName());
		System.out.println("AUTHOR NAME: "+book.getAuthorName());
		System.out.println("PUBLISHED YEAR: "+book.getPublishedYear());

		System.out.print("BOOK COST: ");
		System.out.printf("%.1f",cost);
		}

	}

}
