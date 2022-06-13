package by.tr.home.circle;

/*Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или
равен заданному е. Общий член ряда имеет вид*/

public class Task19 {

	public static void main(String[] args) {

		double a;
		int n;
		double sum;
		double e;

		sum = 0;
		n = 3;
		e = 0.3;
		
		for (int i = 0; i <= n; i++) {

			a = Math.pow(2, -i) +Math.pow(3, -i);

			if (Math.abs(a) >= e) {
				sum += a;
			}
		}

		System.out.println("sum = " + sum);

		

	}

}
