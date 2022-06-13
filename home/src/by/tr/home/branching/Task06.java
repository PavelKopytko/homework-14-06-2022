package by.tr.home.branching;

/*Составить программу: определения наибольшего из двух чисел а и b*/

public class Task06 {

	public static void main(String[] args) {

		int a;
		int b;
		int max;

		a = 6;
		b = 12;

		if (a > b) {
			max = a;
		} else {
			max = b;
		}

		System.out.println("Максимальное число: " + max);

	}

}
