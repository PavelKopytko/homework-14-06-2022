package by.tr.home.branching;

/*Вычислить значение функции*/

public class Task38 {

	public static void main(String[] args) {

		double x;
		double function;

		x = 4;

		if (x >= 0 && x <= 3) {
			function = x * x;
		} else {
			function = 4;
		}

		System.out.println("F(x) = " + function);

	}

}
