package by.tr.home.branching;

/*Вычислить значение функции*/

public class Task39 {

	public static void main(String[] args) {

		double x;
		double function;

		x = 8;

		if (x >= 8) {
			function = -x * x + x - 9;
		} else {
			function = 1.0 / (x * x * x * x - 6);
		}

		System.out.println("F(x) = " + function);

	}

}
