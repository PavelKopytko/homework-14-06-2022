package by.tr.home.branching;

import java.util.Scanner;

/*Написать программу, которая по паролю будет определять уровень доступа сотрудника к секретной информации в
базе данных. Доступ к базе имеют только шесть человек, разбитых на три группы по степени доступа. Они имеют
следующие пароли: 9583, 1747 — доступны модули баз А, В, С; 3331, 7922 — доступны модули баз В, С; 9455, 8997 —
доступен модуль базы С*/

public class Task33 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int password;

		System.out.println("Введите пароль");

		while (!sc.hasNextInt()) {
			System.out.println("Пароль не соответствует требованиям");
			sc.nextLine();
			System.out.println("Введите пароль");
		}

		password = sc.nextInt();

		if (password == 9583 || password == 1747) {
			System.out.println("Открыт доступ к базам A, B, C");
		} else if (password == 3331 || password == 7922) {
			System.out.println("Открыт доступ к базам B, C");
		} else if (password == 9455 || password == 8997) {
			System.out.println("Открыт доступ к базам C");
		} else {
			System.out.println("Доступ закрыт");
		}

	}

}
