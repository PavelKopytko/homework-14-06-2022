package by.tr.home.linear_program;

import java.util.Scanner;

/*Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения
информации*/

public class Task34 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		double inByte;
		double inKByte;
		double inMByte;
		double inGByte;

		System.out.println("Введите объем в байтах");

		while (!sc.hasNextDouble()) {
			System.out.println("Неверно. Повторите");
			sc.nextLine();

		}

		inByte = sc.nextDouble();

		inKByte = inByte / 1000;

		inMByte = inKByte / 1000;

		inGByte = inMByte / 1000;

		System.out.println("inByte:" + inByte);
		System.out.println("inKByte: " + inKByte);
		System.out.println("inMByte: " + inMByte);
		System.out.println("inGByte: " + inGByte);

	}

}
