package by.tr.home.branching;

/*Составить программу нахождения наименьшего из квадратов двух чисел а и b*/

public class Task08 {

	public static void main(String[] args) {

		int a;
		int b;
		int sqrA;
		int sqrB;

		a = 4;
		b = 5;

		sqrA = a * a;
		sqrB = b * b;

		if (sqrA > sqrB) {
			System.out.println("Квадрат числа " + a + " больше квадрата числа " + b);
		} else {
			System.out.println("Квадрат числа " + a + " меньше квадрата числа " + b);
		}

	}

}
