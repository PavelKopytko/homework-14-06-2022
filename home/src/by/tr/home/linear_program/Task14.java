package by.tr.home.linear_program;

/*Вычислить длину окружности и площадь круга одного и того же заданного радиуса R*/

public class Task14 {

	public static void main(String[] args) {

		double radius;
		double length;
		double square;

		radius = 5;

		length = 2 * Math.PI * radius;
		square = Math.PI * radius * radius;

		System.out.println("length = " + length);
		System.out.println("square = " + square);

	}

}
