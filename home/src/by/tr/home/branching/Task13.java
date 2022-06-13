package by.tr.home.branching;

/*Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, 
 * которая из точек находится ближе к началу координат*/

public class Task13 {

	public static void main(String[] args) {

		double x1, y1;
		double x2, y2;

		double distanceFirst;
		double distanceSecond;

		x1 = 2;
		y1 = -6;
		x2 = -5;
		y2 = 5;

		distanceFirst = Math.sqrt(x1 * x1 + y1 * y1);
		distanceSecond = Math.sqrt(x2 * x2 + y2 * y2);

		if (distanceFirst < distanceSecond) {
			System.out.println("Точка с координатами (" + x1 + "," + y1 + ") лежит ближе к началу координат");
		} else if (distanceFirst > distanceSecond) {
			System.out.println("Точка с координатами (" + x2 + "," + y2 + ") лежит ближе к началу координат");
		} else {
			System.out.println("Точки равноудалены от начала координат");
		}
	}
}
