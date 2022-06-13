package by.tr.home.linear_program;

/*Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2)*/

public class Task12 {

	public static void main(String[] args) {

		double x1, y1;
		double x2, y2;
		double length;

		x1 = 1;
		y1 = 2;
		x2 = 8;
		y2 = 6;

		length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		System.out.println("length = " + length);

	}

}
