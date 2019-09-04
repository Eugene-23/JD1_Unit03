package htp.home.task04.main;

import java.util.List;

/*
 * 4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. Создайте 
 * данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам 
 * поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем. Добавьте 
 * возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны 
 * быть упорядочены по времени отправления.
 */

public class Main {

	public static void main(String[] args) {
		
		Depo trains = new Depo(5);
		
		trains.add(new Train("Moscow", 253, 15.18));
		trains.add(new Train("Minsk", 531, 12.10));
		trains.add(new Train("Berlin", 327, 21.40));
		trains.add(new Train("Warszawa", 128, 06.20));
		trains.add(new Train("Vilnius", 826, 02.40));
		
		System.out.println("Вывод поезда по заданному номеру:");
		int n = 253; 
		
		DepoLogic.getTrainInfo(trains, n);

		System.out.println('\n' + "Все поезда без сортировки:");
		List<Train> trainsNotSort = DepoLogic.getTrains(trains);
		printTrains(trainsNotSort);
		
		System.out.println("Сортировка поездов по номеру:");
		Train[] sortNum = DepoLogic.sortTrainsNum(trains);
		printTrains1(sortNum);
		
		System.out.println("Сортировка по месту и времени:");
		Train[] sortNameCity = DepoLogic.sortTrainsNameCity(trains);
		printTrains1(sortNameCity);

	}
	
	public static void printTrains(List<Train> trains) {
		for (Train st : trains) {
			System.out.printf("Номер поезда: %d,  ", st.getTrainNum());
			System.out.printf("Пункт назначения: %s,  ", st.getDestination());
			System.out.printf("Время отправления: %02.2f\n", st.getTime());
		}
	}
	
	public static void printTrains1(Train[] trains) {
		for (Train st : trains) {
			System.out.printf("Номер поезда: %d,  ", st.getTrainNum());
			System.out.printf("Пункт назначения: %s,  ", st.getDestination());
			System.out.printf("Время отправления: %02.2f\n", st.getTime());
		}
	}

}
