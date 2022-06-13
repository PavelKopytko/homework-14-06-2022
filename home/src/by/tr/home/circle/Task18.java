package by.tr.home.circle;

/*Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или
равен заданному е. Общий член ряда имеет вид */

public class Task18 {

	public static void main(String[] args) {

		double a;
		int n;
		double sum;
		double e;

		sum = 0;
		n = 5;
		e = 0.3;

		for (int i = 1; i <= n; i++) {

			a = Math.pow(-1, i - 1) / i;

			if (Math.abs(a) >= e) {
				sum += a;
			}
		}

		System.out.println("sum = " + sum);

	}

}
