package htp.home.task07.main;

public class TriangleLogic {
	
	public static void printTriangle(Triangle tr) {
		System.out.println("Стороны: " + tr.getA() + ", " + tr.getB() + ", " + tr.getC());
	}

	public static double getSquare(Triangle tr) {

		double square;
		double halfPer;
		halfPer = getPerimeter(tr) / 2;
		square = Math.sqrt(halfPer * (halfPer - tr.getA()) * (halfPer - tr.getB()) * (halfPer - tr.getC()));

		return square;
	}

	public static double getPerimeter(Triangle tr) {

		double perimeter;
		perimeter = tr.getA() + tr.getB() + tr.getC();

		return perimeter;
	}

}
