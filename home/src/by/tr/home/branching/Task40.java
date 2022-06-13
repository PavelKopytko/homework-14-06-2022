package by.tr.home.branching;

/*Вычислить значение функции*/

public class Task40 {

	public static void main(String[] args) {

		double x;
		double function;

		x = 14;

		if (x <= 13) {
			function = -x * x * x + 9;
		} else {
			function = -3.0 / (x + 1);
		}

		System.out.println("F(x) = " + function);

	}

}
