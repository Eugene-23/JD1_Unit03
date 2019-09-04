package htp.home.task05.main;

/*
 * 5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на 
 * единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными 
 * значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее 
 * состояние. Написать код, демонстрирующий все возможности класса.
 */

public class Main {

	public static void main(String[] args) {
		
		Counter ct = new Counter();
		
		System.out.println(ct.getCurrentVal());
		
		ct.increaseCurrentVal();
		
		System.out.println(ct.getCurrentVal());
		
		ct.setCurrentVal(23);
		
		System.out.println(ct.getCurrentVal());
		
		ct.reduceCurrentVal();
		
		System.out.println(ct.getCurrentVal());

	}

}
