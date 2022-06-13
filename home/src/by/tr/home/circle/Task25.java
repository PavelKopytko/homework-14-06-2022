package by.tr.home.circle;

import java.util.Scanner;

/*Требуется определить факториал числа, которое ввел пользователь*/

public class Task25 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int a;
		long factorial = 1;

		do {
			System.out.println("Введите натуральное число");
			while (!sc.hasNextInt()) {
				System.out.println("Введенное значение не типа int. Повторите ввод");
				sc.nextLine();
			}
			a = sc.nextInt();

		} while (a <= 0);

		for (int i = 1; i <= a; i++) {
			factorial *= i;
		}
		System.out.println("Факториал числа " + a + " = " + factorial);
	}

}
