package by.tr.home.circle;

import java.util.Scanner;

/*Проверить введенную пользователем строку на наличие недопустимых символов. В качестве
первого символа допустимы только буквы и знак подчеркивания. Остальные символы могут быть
буквами, цифрами и знаком подчеркивания.*/

public class Task32 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите строку");

		String str = sc.nextLine();

		if (str.matches("[A-Za-zА-Яа-я_][\\wА-Яа-я]*")) {
			System.out.println("OK");
		} else {
			System.out.println("Строка не соответствует шаблону");
		}

	}

}
