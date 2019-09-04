package htp.home.task10.main;

import java.util.List;

/*
 * Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString(). 
 * Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами. Задать критерии выбора 
 * данных и вывести эти данные на консоль.
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * Найти и вывести:
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

public class Main {

	public static void main(String[] args) {
		
		Airport port = new Airport(5);
		
		port.add(new Airline("Moskow", 2043, "Pass", (new Time(12, 30)), "Thursday"));
		port.add(new Airline("Berlin", 3549, "Pass", (new Time(06, 45)), "Friday"));
		port.add(new Airline("Moskow", 2371, "Pass", (new Time(21, 10)), "Friday"));
		port.add(new Airline("Vilnius", 5376, "Pass", (new Time(16, 15)), "Tuesday"));
		port.add(new Airline("Kiev", 9268, "Pass", (new Time(02, 20)), "Friday"));
		
		System.out.println("Общий список Авиалиний:");
		List<Airline> getAll = AirportLogic.getAirport(port);
		print(getAll);
		
		System.out.println('\n' + "Список Авиалиний для заданного пункта назначения:");
		List<Airline> getDest = AirportLogic.sortByDestination(port, "Moskow");
		print(getDest);
		
		System.out.println('\n' + "Список Авиалиний для заданного дня недели:");
		List<Airline> getDay = AirportLogic.sortByDayOfWeek(port, "Friday");
		print(getDay);
		
		System.out.println('\n' + "Список Авиалиний для заданного дня недели, время вылета для которых больше заданного:");
		List<Airline> getDayTime = AirportLogic.sortByDayOfWeekAndTime(port, "Friday", new Time(05, 00));
		print(getDayTime);
		

	}
	
	public static void print(List<Airline> line) {
		for (Airline ln : line) {
			System.out.printf("пункт назначения: %s, ", ln.getDestination());
			System.out.printf("номер рейса: %d, ", ln.getFlyghtNum());
			System.out.printf("тип самолета: %s, ", ln.getPlanesType());
			System.out.printf("время вылета: %s, ", ln.getTime());
			System.out.printf("день недели: %s;\n", ln.getDaysOfWeek());
			
		}		
		
	}

}
