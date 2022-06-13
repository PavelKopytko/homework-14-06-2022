package by.tr.home.linear_program;

/*Вычислить значение выражения по формуле (все переменные принимают действительные значения)
 * (sin x + cos y)/(cos x- siny)*tg x*y*/

import static java.lang.Math.*;

public class Task10 {

	public static void main(String[] args) {

		double x;
		double y;
		double result;

		x = 2.5;
		y = 3;

		result = (sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(x * y);

		System.out.println(result);
	}

}
