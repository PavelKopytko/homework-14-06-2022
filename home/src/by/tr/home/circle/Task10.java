package by.tr.home.circle;

/*Составить программу нахождения произведения квадратов первых двухсот чисел*/

public class Task10 {

	public static void main(String[] args) {

		long multiplication = 1;

		for (int i = 1; i <= 100; i++) {

			multiplication *= i * i;

			if (multiplication < 0) {

				System.out.println("Достигнуто переполнение long");
				return;
			}
		}
		System.out.println("multiplication = " + multiplication);
	}

}
