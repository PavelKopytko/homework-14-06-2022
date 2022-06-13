package by.tr.home.circle;

import java.util.Scanner;

/*Найдите количество четных цифр данного натурального числа*/

public class Task35 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int number;
		int n;
		int saveN;
		int count = 0;

		System.out.println(">");

		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println(">");
		}
		number = sc.nextInt();

		saveN = number;
		n = number;

		do {
			saveN = n % 10;
			n /= 10;
			if (saveN != 0) {
				if (saveN % 2 == 0) {
					count++;
				}
			}

		} while (n > 0);

		System.out.println("Количество четных цифр данного натурального числа - " + count);

	}

}
