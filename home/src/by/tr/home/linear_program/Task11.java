package by.tr.home.linear_program;

/*Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов*/

public class Task11 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double perimeter;
		double square;

		a = 3;
		b = 4;

		c = Math.sqrt(a * a + b * b);

		perimeter = a + b + c;
		square = (a + b) / 2;

		System.out.println("perimeter = " + perimeter);
		System.out.println("square = " + square);

	}

}
