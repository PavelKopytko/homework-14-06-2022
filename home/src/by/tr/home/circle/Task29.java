package by.tr.home.circle;

import java.util.Scanner;

/*Даны два числа. Определить цифры, входящие в запись как первого так и второго числа*/

public class Task29 {

	public static void main(String[] args) {

		int a;
		int b;
		int numberCountA;
		int numberCountB;

		a = getValue();
		b = getValue();

		numberCountA = getCountOfNumbers(a);
		numberCountB = getCountOfNumbers(b);

		int numberA;
		numberA = a;

		int numberB = b;
		int saveB;

		System.out.print("Одинаковые цифры чисел: ");

		for (int i = 0; i < numberCountA; i++) {

			numberA = a % 10;
			a /= 10;
			saveB = b;
			for (int j = 0; j < numberCountB; j++) {

				numberB = saveB % 10;
				saveB /= 10;
				if (numberA == numberB) {
					System.out.print(" " + numberA);
				}

			}
		}

	}

	private static int getValue() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите число");
		while (!sc.hasNextInt()) {
			System.out.println("Введенное значение не int. Повторите ввод");
			sc.nextLine();
		}
		return sc.nextInt();

	}

	private static int getCountOfNumbers(int number) {
		int count = 0;

		do {
			number /= 10;
			count++;

		} while (number > 0);

		return count;
	}

}
