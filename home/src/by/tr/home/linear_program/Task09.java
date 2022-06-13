package by.tr.home.linear_program;

/*Вычислить значение выражения по формуле (все переменные принимают действительные значения)
 * a/c*b/d-(a*b-c)/c/d*/

public class Task09 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double d;
		double result;

		a = 5;
		b = 5;
		c = 1;
		d = 6;

		result = a / c * b / d - (a * b - c) / c / d;

		System.out.println(result);

	}

}
