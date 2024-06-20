package BookShop;

public class Book {
	private String bookName;
	private String authorName;
	private int publishedYear;
	private double cost;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getPublishedYear() {
		return publishedYear;
	}
	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public Book(String bookName, String authorName, int publishedYear, double cost) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.publishedYear = publishedYear;
		this.cost = cost;
	}
	public double calculateBookCost() {
		double bookcost=0;
		if(publishedYear<1900 && publishedYear>2020 && cost<0) {
			return 0;
		}
		
		else if(publishedYear>=1900 && publishedYear<=2020 && cost>0 ) 
		{
			if(publishedYear>=1900 && publishedYear<=1940) {
				bookcost= cost-(cost*0.25);
			}
			else if(publishedYear>=1941 && publishedYear<=1980) {
				bookcost= cost-(cost*0.35);
			}
			else if(publishedYear>=1981 && publishedYear<=2020) {
				bookcost= cost-(cost*0.15);
			}
			
		}
		
			return bookcost;
		
		
	}
	
}
