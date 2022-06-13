package by.tr.home.branching;

import java.util.Scanner;

/*Определить правильность даты, введенной с клавиатуры (число — от 1 до 31,
 *  месяц — от 1 до 12). Если введены некорректные данные, то сообщить об этом*/

public class Task23 {

	public static void main(String[] args) {

		int day;
		int month;

		System.out.println("Введите число");
		day = getValue();

		System.out.println("Введите месяц");
		month = getValue();

		if (day < 1 || day > 31 || month < 1 || month > 12) {
			System.out.println("Введены некорректные значение");
		} else {
			System.out.println("Данные введены корректно");
		}

	}

	private static int getValue() {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		while (!scanner.hasNextInt()) {
			scanner.nextLine();
			System.out.println("Введено некорректное значение. Введите значение еще раз");
		}
		return scanner.nextInt();
	}

}
