package htp.home.task09.main;

public class Book {

	private int id;
	private String title;
	private String author;
	private String publishingOffice;
	private int year;
	private int countOfPages;
	private int price;
	private String bindingType;
	
	public Book() {
		
	}

	public Book(int id, String title, String author, String publishingOffice, int year, int countOfPages, int price,
			String bindingType) {
		
		this.id = id;
		this.title = title;
		this.author = author;
		this.publishingOffice = publishingOffice;
		this.year = year;
		this.countOfPages = countOfPages;
		this.price = price;
		this.bindingType = bindingType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishingOffice() {
		return publishingOffice;
	}

	public void setPublishingOffice(String publishingOffice) {
		this.publishingOffice = publishingOffice;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getCountOfPages() {
		return countOfPages;
	}

	public void setCountOfPages(int countOfPages) {
		this.countOfPages = countOfPages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBindingType() {
		return bindingType;
	}

	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}

	@Override
	public String toString() {
		return "[id = " + id + ", title = " + title + ", author = " + author + ", publishingOffice = " + publishingOffice
				+ ", year = " + year + ", countOfPages = " + countOfPages + ", price = " + price + ", bindingType = "
				+ bindingType + "]";
	}			
	
}
