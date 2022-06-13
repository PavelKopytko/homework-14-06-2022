package by.tr.home.circle;

/*Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
значения функции F(x) ctg (x/3)+1/2*sin x;*/

public class Task23 {

	public static void main(String[] args) {

		int a;
		int b;
		double h;
		double y;

		a = -5;
		b = 5;
		h = 0.5;

		System.out.printf("|\t%s\t|\t%s\t|\n", "x", "F(x)");
		System.out.println("_________________________________");

		for (double x = a; x <= b; x += h) {

			y = Math.pow(Math.tan(x / 3), -1) + 1.0 / 2 * Math.sin(x);

			System.out.printf("|\t%2.2f\t|\t%2.2f\t|\n", x, y);
		}

	}
}
