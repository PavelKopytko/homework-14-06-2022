package by.tr.home.branching;

/*Составить программу нахождения модуля выражения a*x*x + b*x + c 
 * при заданных значениях a, b, c и х*/

public class Task07 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int x;
		int function;
		int module;

		a = -5;
		b = -4;
		c = 3;
		x = 1;

		function = a * x * x + b * x + c;

		if (function < 0) {
			module = -function;
		} else {
			module = function;
		}

		System.out.println("Значение выражения равно: " + function);
		System.out.println("Модуль выражения равен: " + module);

	}

}
