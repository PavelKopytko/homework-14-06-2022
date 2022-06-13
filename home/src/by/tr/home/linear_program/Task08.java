package by.tr.home.linear_program;

/*Вычислить значение выражения по формуле (все переменные принимают действительные значения):*/

public class Task08 {

	public static void main(String[] args) {

		double result;
		double a;
		double b;
		double c;

		a = 0.5;
		b = 4.4;
		c = 3.0;

		result = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - a * a * a * c + Math.pow(b, -2);

		System.out.println(result);

	}

}
