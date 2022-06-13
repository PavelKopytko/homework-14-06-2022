package by.tr.home.circle;

import java.util.Scanner;

/*Вводится натуральное число. Найти сумму четных цифр, входящих в его состав. Преобразовать
его в другое число, цифры которого будут следовать в обратном порядке по сравнению с введенным
числом*/

public class Task24 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

//		System.out.println("Введите натуральное число");

		int a;
		int reverseA;
		int number;
		int sum;
		int saveA;

		do {
			System.out.println("Введите натуральное число");
			while (!sc.hasNextInt()) {
				System.out.println("Введенное значение не типа int");
				sc.nextLine();
			}
			a = sc.nextInt();

		} while (a <= 0);

		saveA = a;
		reverseA = 0;
		sum = 0;

		do {
			number = saveA % 10;
			if (number % 2 == 0) {
				sum += number;
			}
			saveA = saveA / 10;
			reverseA = reverseA * 10 + number;

		} while (saveA > 0);

		System.out.println("Новое число = " + reverseA);

		System.out.println("Сумма четных цифр = " + sum);

	}

}
