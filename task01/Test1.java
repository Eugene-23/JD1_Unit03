package htp.home.task01.main;

/*
 * Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных. 
 * Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение 
 * из этих двух переменных.
 */

public class Test1 {
	
	private int a;
	private int b;
	
	public Test1(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	public void print() {
		System.out.println("a = " + a + "; b = " + b);
	}
	
	public int sum() {
		int sum = this.a + this.b;
		return sum;
	}
	
	public int max() {
		int max = Math.max(this.a, this.b);
		return max;
	}
	
	

	public static void main(String[] args) {
		
		Test1 ab1 = new Test1(2, 5);
		
		ab1.print();
		
		ab1.setA(3);
		ab1.setB(7);
		
		ab1.print();
		
		int sum = ab1.sum();
		System.out.println("Sum = " + sum);

		int max = ab1.max();
		System.out.println("Max = " + max);
		
	}

}
