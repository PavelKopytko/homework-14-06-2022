package by.tr.home.branching;

import java.util.Scanner;

/* Вычислить число и месяц в невисокосном году по номеру дня*/

public class Task35 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int day;

		do {
			System.out.println("Введите день");

			while (!sc.hasNextInt()) {
				System.out.println("Неверное значенеи");
				sc.nextLine();
				System.out.println("Повторите ввод");
			}

			day = sc.nextInt();

		} while (day <= 0 || day >= 366);

		if (day > 0 && day <= 31) {
			System.out.println(day + " января");
		} else if (day > 31 && day <= 59) {
			System.out.println(day - 31 + " февраля");
		} else if (day > 59 && day <= 90) {
			System.out.println(day - 59 + " марта");
		} else if (day > 90 && day <= 120) {
			System.out.println(day - 90 + " апреля");
		} else if (day > 120 && day <= 151) {
			System.out.println(day - 120 + " мая");
		} else if (day > 151 && day <= 181) {
			System.out.println(day - 151 + " июня");
		} else if (day > 181 && day <= 212) {
			System.out.println(day - 181 + " июля");
		} else if (day > 212 && day <= 243) {
			System.out.println(day - 212 + " августа");
		} else if (day > 243 && day <= 273) {
			System.out.println(day - 243 + " сентября");
		} else if (day > 273 && day <= 304) {
			System.out.println(day - 273 + " октября");
		} else if (day > 304 && day <= 334) {
			System.out.println(day - 304 + " ноября");
		} else if (day > 334 && day <= 365) {
			System.out.println(day - 334 + " декабря");
		}

	}

}
