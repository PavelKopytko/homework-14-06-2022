package by.tr.home.circle;

import java.util.Scanner;

/*Написать программу, переводящую римские цифры в арабские*/

public class Task30 {

	public static void main(String[] args) {

		String str;
		int a = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите число");

		str = sc.next();
		str = str.toUpperCase();

		switch (str) {
		case "I":
			a = 1;
			break;
		case "II":
			a = 2;
			break;
		case "III":
			a = 3;
			break;
		case "IV":
			a = 4;
			break;
		case "V":
			a = 5;
			break;
		case "VI":
			a = 6;
			break;
		case "VII":
			a = 7;
			break;
		case "VIII":
			a = 8;
			break;
		case "IX":
			a = 9;
			break;
		case "X":
			a = 10;
			break;
		default:
			System.out.println("Введено неверное значение");
			return;

		}
		System.out.println("Римскому " + str + " соответствует арабское " + a);

	}

}
