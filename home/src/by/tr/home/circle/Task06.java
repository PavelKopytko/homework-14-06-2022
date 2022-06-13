package by.tr.home.circle;

import java.util.Scanner;

/*Напишите программу, где пользователь вводит любое целое положительное число. А программа
суммирует все числа от 1 до введенного пользователем числа*/

public class Task06 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int i = 1;
		int sum = 0;

		System.out.println("Введите число");

		while (!sc.hasNextInt()) {

			sc.nextLine();
			System.out.println("Введено неверное значение. Повторите ввод");
		}

		int x;
		x = sc.nextInt();

		if (x <= 1) {

			System.out.println("Введенное число должно быть больше 1");
			return;

		} else {

			for (; i <= x; i++) {
				sum += i;
			}
		}
		System.out.println("Сумма чисел от 1 до " + x + " = " + sum);
	}
}
