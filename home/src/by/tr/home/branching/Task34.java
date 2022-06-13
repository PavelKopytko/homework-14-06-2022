package by.tr.home.branching;

import java.util.Scanner;

/*Составить программу, реализующую эпизод применения компьютера в книжном магазине. Компьютер
запрашивает стоимость книг, сумму денег, внесенную покупателем; если сдачи не требуется, печатает на экране
«спасибо»; если денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи; если
денег недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы*/

public class Task34 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		double value;
		double payment;

		System.out.println("Введите стоимость книг");

		while (!sc.hasNextDouble()) {
			System.out.println("Введено не число");
			sc.nextLine();
			System.out.println("Повторите ввод");
		}

		value = sc.nextDouble();

		System.out.println("Внесите оплату");

		while (!sc.hasNextDouble()) {
			System.out.println("Введено не число");
			sc.nextLine();
			System.out.println("Повторите ввод");
		}

		payment = sc.nextDouble();

		if (payment == value) {
			System.out.println("Спасибо");
		} else if (payment > value) {
			System.out.println("Возьмите сдачу " + (payment - value));
		} else {
			System.out.println("Недостаточно средств");
		}

	}

}
