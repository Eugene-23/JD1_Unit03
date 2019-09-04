package htp.home.task04.main;

import java.util.ArrayList;
import java.util.List;

public class DepoLogic {

	public static List<Train> getTrains(Depo trains) { // массив поездов

		Train[] tr = trains.getTrains();
		List<Train> result = new ArrayList<Train>();
		for (Train st : tr) {
			result.add(st);
		}
		return result;
	}

	public static Train[] sortTrainsNum(Depo trains) { // сортировка по номеру поезда

		Train[] tr1 = trains.getTrains();

		for (int i = 0; i < tr1.length - 1; i++) {
			Train max = tr1[i];
			int maxIndex = i;
			for (int j = i + 1; j < tr1.length; j++) {
				if (tr1[j].getTrainNum() < max.getTrainNum()) {
					max = tr1[j];
					maxIndex = j;
				}
			}
			if (i != maxIndex) {
				Train temp = tr1[i];
				tr1[i] = tr1[maxIndex];
				tr1[maxIndex] = temp;
			}

		}
		return tr1;
	}

	
	public static Train[] sortTrainsNameCity(Depo trains) {  // сортировка по пункту назначения
		Train[] tr1 = trains.getTrains();

		for (int i = 0; i < tr1.length - 1; i++) {
			Train max = tr1[i];
			int maxIndex = i;
			for (int j = i + 1; j < tr1.length; j++) {
				if (tr1[j].getDestination().compareTo(max.getDestination()) < 0) {
					max = tr1[j];
					maxIndex = j;
				}
				if (tr1[j].getDestination().compareTo(max.getDestination()) == 0) {
					if (tr1[j].getTime() < max.getTime()) {
						max = tr1[j];
						maxIndex = j;
					}
				}
			}
			if (i != maxIndex) {
				Train temp = tr1[i];
				tr1[i] = tr1[maxIndex];
				tr1[maxIndex] = temp;
			}
		}

		return tr1;
	}

	public static void getTrainInfo(Depo trains, int num) { // инфо по номеру поезда

		Train[] tr = trains.getTrains();
		for (Train t : tr) {
			if (num == t.getTrainNum()) {
				System.out.printf("Номер поезда: %d,  ", t.getTrainNum());
				System.out.printf("Пункт назначения: %s,  ", t.getDestination());
				System.out.printf("Время отправления: %02.2f\n", t.getTime());
			}
		}
	}

}
