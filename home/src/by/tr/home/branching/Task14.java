package by.tr.home.branching;

import java.util.Scanner;

/*Даны два угла треугольника (в градусах). Определить, существует ли 
 * такой треугольник, и если да, то будет ли он прямоугольным*/

public class Task14 {

	public static void main(String[] args) {

		double angleFirst;
		double angleSecond;

		System.out.println("Введите значение первого угла в градусах");
		angleFirst = getValue();

		System.out.println("Введите значение второго угла в градусах");
		angleSecond = getValue();

		if (angleFirst + angleSecond < 180) {
			System.out.println("Треугольник существует.");

			if (angleFirst == 90 || angleSecond == 90 || (angleFirst + angleSecond) == 90) {
				System.out.println("Треугольник прямоугольный.");
			}
		} else {
			System.out.println("Треугольник не существует.");
		}

	}

	private static double getValue() {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		while (!scanner.hasNextDouble()) {
			scanner.nextLine();
			System.out.println("Введено некорректное значение. Введите значени еще раз");
		}
		return scanner.nextDouble();
	}

}
