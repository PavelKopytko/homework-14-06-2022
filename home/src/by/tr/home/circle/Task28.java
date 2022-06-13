package by.tr.home.circle;

import java.util.Scanner;

/*Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *). Вычислить
результат Z в зависимости от знака. Предусмотреть реакции на возможный неверный знак операции, а
также на ввод Y=0 при делении. Организовать возможность многократных вычислений без
перезагрузки программа (т.е. построить цикл). В качестве символа прекращения вычислений принять
‘0’*/

public class Task28 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		double x;
		double y;
		double result = 0;
		String input = "";

		while (true) {

			System.out.println("Введите любое значение или '0' для прекращенияа");

			input = sc.next();
			if (input.equals("0")) {
				return;
			}

			x = getValue();
			y = getValue();

			System.out.println("Введите знак операции (+, –, /, *)");
			input = sc.next();

			switch (input) {
			case "+":
				result = x + y;
				System.out.println(x + " " + input + " " + y + " = " + result);
				break;
			case "-":
				result = x - y;
				System.out.println(x + " " + input + " " + y + " = " + result);
				break;
			case "*":
				result = x * y;
				System.out.println(x + " " + input + " " + y + " = " + result);
				break;
			case "/":
			case "%":
				if (y != 0) {
					result = x / y;
					System.out.println(x + " " + input + " " + y + " = " + result);
					break;
				} else {
					System.out.println("Деление на 0 запрещено");
					break;
				}
			default:
				System.out.println("Введен неверный знак операции");
			}
		}

	}

	private static double getValue() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите число");
		while (!sc.hasNextDouble()) {
			System.out.println("Введенное значение не корректно. Повторите ввод");
			sc.nextLine();
		}
		return sc.nextDouble();

	}

}
