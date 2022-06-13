package by.tr.home.linear_program;

/*Дано значение х. Получить значения -2х + 3х2 - 4х3 и 1 + 2х + 3х2 + 4х3 . Позаботьтесь об экономии операций*/

public class Task40 {

	public static void main(String[] args) {

		double x;
		double result1;
		double result2;

		x = 2;

		result1 = -x * (Math.pow(2 * x - 3.0 / 4, 2) + 2 - 9.0 / 16);
		result2 = x * (Math.pow(2 * x + 3.0 / 4, 2) + 2 - 9.0 / 16) + 1;

		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);

	}

}
