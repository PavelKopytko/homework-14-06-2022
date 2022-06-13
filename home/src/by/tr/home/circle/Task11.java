package by.tr.home.circle;

/*Составить программу нахождения разности кубов первых двухсот чисел*/

public class Task11 {

	public static void main(String[] args) {

		long sub = 0;

		for (int i = 0; i <= 200; i++) {

			sub -= i * i * i;

			if (sub > 0) {

				System.out.println("Достигнуто переполнение long");
				return;
			}
		}

		System.out.println("sub = " + sub);

	}

}
