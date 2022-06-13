package by.tr.home.linear_program;

/*Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь прямоугольника*/

public class Task07 {

	public static void main(String[] args) {

		double width;
		double length;
		double square;

		length = 5;
		width = length / 2;

		square = length * width;

		System.out.println("Square = " + square);

	}

}
