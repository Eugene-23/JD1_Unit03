package htp.home.task09.main;

import java.util.List;

/*
 * Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString(). 
 * Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. Задать критерии выбора 
 * данных и вывести эти данные на консоль.
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 * Найти и вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущенных заданным издательством;
 * c) список книг, выпущенных после заданного года. 
 */

public class Main {

	public static void main(String[] args) {		

		Library lib = new Library(5);
				
		lib.add(new Book(2043, "Voina i mir", "Tolstoy", "Novaya Zaria", 1895, 1741, 50, "Tverdyi"));
		lib.add(new Book(2044, "Gore ot Uma", "Griboedov", "Minsk", 1912, 326, 27, "Tverdyi"));
		lib.add(new Book(2045, "Mu mu", "Turgenev", "Leningrad", 1923, 234, 35, "Miagkij"));
		lib.add(new Book(2046, "Anna Karenina", "Tolstoy", "Moskva", 1907, 654, 45, "Tverdyi"));
		lib.add(new Book(2047, "Otcy i deti", "Turgenev", "Moskva", 1930, 379, 30, "Tverdyi"));
		
		System.out.println("Общий список книг:");
		List<Book> getAll = LibraryLogic.getBookInfo(lib);
		print(getAll);
		
		System.out.println('\n' + "Список книг с сортировкой по автору:");
		List<Book> getAut = LibraryLogic.sortByAuthor(lib, "Tolstoy");
		print(getAut);
		
		System.out.println('\n' + "Список книг с сортировкой по издательству:");
		List<Book> getPub = LibraryLogic.sortByPublishingOffice(lib, "Moskva");
		print(getPub);
		
		System.out.println('\n' + "Список книг с сортировкой поcле заданного года:");
		List<Book> getYear = LibraryLogic.sortByYear(lib, 1910);
		print(getYear);

	}
	
	public static void print(List<Book> lib) {
		for (Book bk : lib) {
			System.out.printf("Id: %d, ", bk.getId());
			System.out.printf("название: %s, ", bk.getTitle());
			System.out.printf("автор: %s\n", bk.getAuthor());			
		}		
		
	}

}
