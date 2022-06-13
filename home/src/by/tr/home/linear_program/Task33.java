package by.tr.home.linear_program;

import java.util.Scanner;

/*Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы*/

public class Task33 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите символ");

		String str = sc.next();

		char numberChar = str.charAt(0);

		int numberInt = (int) numberChar;

		System.out.println("Порядковый номер символа " + str + " = " + numberInt);
		System.out.println("Предыдущий символ с номером " + (numberInt - 1) + " - " + (char) (numberInt - 1));
		System.out.println("Последующий символ с номером " + (numberInt + 1) + " - " + (char) (numberInt + 1));
	}

}
