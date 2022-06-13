package by.tr.home.branching;

import java.util.Scanner;

/*Составить программу сравнения введенного числа а и цифры 3. Вывести на 
 * экран слово «yes», если число а меньше 3; если больше, то вывести слово «no»*/

public class Task03 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		double a;
		int b = 3;

		System.out.println("Введите число");

		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Введено некорректное значение. Введите значение еще раз");
		}

		a = Double.parseDouble(sc.next());
		
		if (a < b) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

}
