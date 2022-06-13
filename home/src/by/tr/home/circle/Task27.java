package by.tr.home.circle;

import java.util.Scanner;

/*Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и
самого числа. m и n вводятся с клавиатуры*/

public class Task27 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int m;
		int n;

		do {
			System.out.println("Введите натуральное число m");
			while (!sc.hasNextInt()) {
				System.out.println("Введенное значение не типа int. Повторите ввод");
				sc.nextLine();
			}
			m = sc.nextInt();

		} while (m <= 0);

		do {
			System.out.println("Введите натуральное число n");
			while (!sc.hasNextInt()) {
				System.out.println("Введенное значение не типа int. Повторите ввод");
				sc.nextLine();
			}
			n = sc.nextInt();

		} while (n <= 0 || n < m);

		for (int i = m; i <= n; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					System.out.println("Делитель числа " + i + " : " + j + " ");
//					System.out.println(j + " ");
				}

			}
		}

	}

}
