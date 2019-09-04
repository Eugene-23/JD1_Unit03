package htp.home.task07.main;

/*
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления 
 * площади, периметра и точки пересечения медиан.
 */

public class Main {

	public static void main(String[] args) {
		
		Triangle tr1 = new Triangle(6, 3, 2);
		
		tr1.setA(4);
		
		TriangleLogic.printTriangle(tr1);
		
		double p = TriangleLogic.getPerimeter(tr1);		
		System.out.printf("Периметр = %.2f\n", p);
		
		double sq = TriangleLogic.getSquare(tr1);		
		System.out.printf("Площадь = %.2f", sq);
		
		

	}

}
