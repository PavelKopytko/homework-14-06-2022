package by.tr.home.circle;

/*Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом 0.5*/

public class Task13 {

	public static void main(String[] args) {

		int a;
		int b;
		double h;
		double y;

		a = -5;
		b = 5;
		h = 0.5;

		System.out.printf("|\t%s\t|\t%s\t|\n", "x", "y");
		System.out.println("_________________________________");

		for (double x = a; x <= b; x += h) {

			y = 5 - x * x / 2;

			System.out.printf("|\t%2.2f\t|\t%2.2f\t|\n", x, y);
		}

	}

}
