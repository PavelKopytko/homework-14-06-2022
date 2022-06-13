package by.tr.home.circle;

/*Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или
равен заданному е. Общий член ряда имеет вид*/

public class Task20 {

	public static void main(String[] args) {
		double a;
		int n;
		double sum;
		double e;

		sum = 0;
		n = 3;
		e = -5.0;

		for (int i = 0; i <= n; i++) {

			a = 1.0 / ((3 * i - 2) * (3 * i + 1));

			if (Math.abs(a) >= e) {
				sum += a;
			}
		}

		System.out.println("sum = " + sum);

	}

}
