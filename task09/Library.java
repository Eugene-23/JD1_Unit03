package htp.home.task09.main;

public class Library {
	
	private Book[] books;
	private int countOfBooks;
	
	public Library(int number) {
		books = new Book[number];
		countOfBooks = 0;
	}
	
	public boolean add(Book newBook) {
		if(countOfBooks >= books.length) {
			return false;
		}
		
		books[countOfBooks] = newBook;
		countOfBooks++;
		return true;
	}	
			
	public Book[] getBooks() {
		return books;
	}
	
	public void setBooks(Book[] books) {
		this.books = books;
	}

}
