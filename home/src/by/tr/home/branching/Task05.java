package by.tr.home.branching;

/*Составить программу: определения наименьшего из двух чисел а и b*/

public class Task05 {

	public static void main(String[] args) {

		int a;
		int b;
		int min;

		a = 6;
		b = 3;

		if (a < b) {
			min = a;
		} else {
			min = b;
		}

		System.out.println("Минимальное число: " + min);

	}

}
