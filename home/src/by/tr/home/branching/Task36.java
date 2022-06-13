package by.tr.home.branching;

/*Вычислить значение функции*/

public class Task36 {

	public static void main(String[] args) {

		double x;
		double function;

		x = 6;

		if (x <= 3) {
			function = x * x - 3 * x + 9;
		} else {
			function = 1.0 / (x * x * x + 6);
		}

		System.out.println("F(x) = " + function);
	}

}
