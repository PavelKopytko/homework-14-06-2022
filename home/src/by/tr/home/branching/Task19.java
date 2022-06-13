package by.tr.home.branching;

/*Подсчитать количество положительных среди чисел а, b, с*/

public class Task19 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		int count = 0;

		a = 4;
		b = 10;
		c = 3;

		if (a > 0) {
			count++;
		}
		if (b > 0) {
			count++;
		}
		if (c > 0) {
			count++;
		}

		System.out.println("Количество положительных чисел: " + count);

	}

}
