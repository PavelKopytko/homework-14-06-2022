package by.tr.home.linear_program;

/*Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и
false — в противном случае:
• Целое число N является четным двузначным числом.
• Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.
• Сумма цифр данного трехзначного числа N является четным числом.
• Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= m, х= n (m<n).
• Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
• Треугольник со сторонами а,b,с является равнобедренным.
• Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.
• Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4).
• График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, п).*/

public class Task37 {

	public static void main(String[] args) {

		task1();
		task2();
		task3();
		task4();
		task5();
		task6();
		task7();
		task8();
		task9();

	}

	private static void task1() {
		int n;
		n = 20;
		int saveN = n;
		int count = 0;

		do {
			saveN /= 10;
			count++;
		} while (saveN % 10 > 0);

		System.out.println("Число " + n + " четное, двухзначное: " + (n % 2 == 0 && count >= 2));

	}

	private static void task2() {

		int number;

		number = 1230;

		int four = number % 10;
		int three = (number % 100 - four) / 10;
		int two = (number % 1000 - number % 100) / 100;
		int one = number / 1000;

		System.out.println("Сумма первых цифр числа равна сумме последних: " + (one + two == three + four));

	}

	private static void task3() {

		int number;
		int sum;

		number = 123;

		int three = number % 10;
		int two = (number % 100 - three) / 10;
		int one = number / 100;

		sum = (one + two + three);

		System.out.println("Сумма цифр числа " + number + " является четным числом: " + (sum % 2 == 0));

	}

	private static void task4() {
		int x, y;

		int m = 2;
		int n = 6;
		x = 5;
		y = 6;
		System.out.println("Точка с координатами " + x + "," + y + " лежит между m и n: " + (x >= m && x <= n));
	}

	private static void task5() {
		int number;
		int sum;

		number = 123;

		int three = number % 10;
		int two = (number % 100 - three) / 10;
		int one = number / 100;

		sum = (one + two + three);

		System.out.println(
				"Квадрат числа " + number + " равен кубу суммы цифр числа: " + (number * number == sum * sum * sum));
	}

	private static void task6() {

		int a, b, c;
		a = 3;
		b = 4;
		c = 5;

		System.out.println("Теугольник равнобедренный: " + (a == b || b == c || a == c));

	}

	private static void task7() {
		int number;

		number = 123;

		int three = number % 10;
		int two = (number % 100 - three) / 10;
		int one = number / 100;

		System.out.println("Сумма двух цифр числа  " + number + " равна третьей: "
				+ (one + two == three || one + three == two || two + three == one));
	}

	private static void task8() {
		int number;
		number = 8;
		int a = 2;
		System.out.println("Число  " + number + " является степенью числа " + a + " : "
				+ (number == 1 || number == a || number == a * a || number == a * a * a || number == a * a * a * a));

	}

	private static void task9() {
		int m = 1;
		int n = 7;

		int a = 1;
		int b = -3;
		int c = 9;

		System.out.println(
				"График y = a*x*x+b*x+c проходит через точку (" + m + "," + n + "): " + (n == a * m * m + b * m + c));

	}

}
