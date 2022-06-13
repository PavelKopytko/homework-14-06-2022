package by.tr.home.linear_program;

/*Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее 
 * геометрическое модулей этих чисел*/

import static java.lang.Math.*;

public class Task17 {

	public static void main(String[] args) {

		double a;
		double b;
		double averageArithmetic;
		double averageGeometric;

		a = 1.0;
		b = -1.0;

		averageArithmetic = (pow(a, 3) + pow(b, 3)) / 2;
		averageGeometric = sqrt(abs(a) * abs(b));

		System.out.println("averageArithmetic = " + averageArithmetic);
		System.out.println("averageGeometric = " + averageGeometric);

	}

}
