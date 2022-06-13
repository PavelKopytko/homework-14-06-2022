package by.tr.home.circle;

import java.util.Scanner;

/*Найдите наибольшую цифру данного натурального числа.*/

public class Task33 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int number;
		int n;
		int saveN;
		int max;

		System.out.println(">");
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println(">");
		}
		number = sc.nextInt();

		saveN = number;
		n = number;

		max = saveN % 10;
		do {
			saveN = n % 10;
			n /= 10;
			if (max < saveN) {
				max = saveN;
			}

		} while (n  > 0);

		System.out.println("Наибольшая цифра числа " + number + " : " + max);

	}

}
