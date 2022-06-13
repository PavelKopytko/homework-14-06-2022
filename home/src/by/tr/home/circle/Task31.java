package by.tr.home.circle;

import java.util.Random;
import java.util.Scanner;

/*Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек пытается их
угадать. Программа должна выводить угаданные и неугаданные числа из тех, что сгенерировала
программа, а также ошибочные числа пользователя*/

public class Task31 {

	public static void main(String[] args) {

		Random rand1 = new Random();

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int a;
		int b;

		for (int i = 0; i < 5; i++) {
			a = rand1.nextInt(14) + 1;
			System.out.println("Введите число a:");
			b = sc.nextInt();

			if (a == b) {
				System.out.println("Совпадение " + a);
			} else {
				System.out.println("Не повезло a=" + a);
			}
		}

	}

}
