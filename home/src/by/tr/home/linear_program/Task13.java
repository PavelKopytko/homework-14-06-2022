package by.tr.home.linear_program;

/*Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3). Найти его периметр и площадь*/

public class Task13 {

	public static void main(String[] args) {
		double x1, y1;
		double x2, y2;
		double x3, y3;
		double perimeter;
		double square;

		double lengthA, lengthB, lengthC;
		double halfPerimeter;

		x1 = 1;
		y1 = 1;
		x2 = 5;
		y2 = 5;
		x3 = 10;
		y3 = 1;

		lengthA = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		lengthB = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
		lengthC = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));

		perimeter = lengthA + lengthB + lengthC;
		halfPerimeter = perimeter / 2;

		square = Math.sqrt(
				halfPerimeter * (halfPerimeter - lengthA) * (halfPerimeter - lengthB) * (halfPerimeter - lengthC));

		System.out.println("perimeter = " + perimeter);
		System.out.println("square = " + square);
	}

}
