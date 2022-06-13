package by.tr.home.branching;

import java.util.Scanner;

/*Составить программу, которая определит по трем введенным сторонам, является 
 * ли данный треугольник равносторонним*/

public class Task09 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;

		System.out.println("Введите величину стороны a:");
		a = getValue();

		System.out.println("Введите величину стороны b:");
		b = getValue();

		System.out.println("Введите величину стороны c:");
		c = getValue();

		if (a == b && b == c) {
			System.out.println("Треугольник равносторонний");
		} else {
			System.out.println("Треугольник не равносторонний");
		}

	}

	private static double getValue() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.println("Введено некорректное значение. Введите значени еще раз");
		}
		return sc.nextDouble();
	}

}
