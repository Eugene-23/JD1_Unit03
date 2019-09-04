package htp.home.task08.main;

import java.util.List;

/*
 * Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString(). 
 * Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами. Задать критерии выбора 
 * данных и вывести эти данные на консоль.
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * Найти и вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */

public class Main {

	public static void main(String[] args) {
		
		CustomerInfo cust = new CustomerInfo(5);
				
		cust.add(new Customer(2345, "Ivanov P.V.", "Lida, Lenina, 18", 654654, 5741657));
		cust.add(new Customer(2346, "Petrov V.A.", "Grodno, Sovetskaya, 2", 616544, 6472384));
		cust.add(new Customer(2347, "Vasil'ev K.N.", "Minsk, Centralnaya, 35", 654054, 9716473));
		cust.add(new Customer(2348, "Fedorov N.V.", "Vitebsk, Letnaya, 41", 554234, 3612873));
		cust.add(new Customer(2349, "Sidorov B.V", "Gomel, Gedymina, 23", 574195, 9435817));
		
		System.out.println("Общий список клиентов:");
		List<Customer> getAll = CustomerLogic.getCustomerInfo(cust);
		print(getAll);
		
		System.out.println('\n' + "Список клиентов с сортировкой по алфовиту:");
		List<Customer> getSort = CustomerLogic.sortCustInfo(cust);
		print(getSort);
		
		System.out.println('\n' + "Список клиентов, у которых номер кредитной карточки находится в заданном интервале:");
		List<Customer> getSortCard = CustomerLogic.sortCardNumber(cust, 600000, 655000);
		print(getSortCard);		
		
	}
	
	public static void print(List<Customer> cust) {
		for (Customer ct : cust) {
			System.out.printf("Id: %d, ", ct.getId());
			System.out.printf("ФИО: %s, ", ct.getName());
			System.out.printf("номер карты: %d\n", ct.getCreditCard());			
		}		
		
	}

}
