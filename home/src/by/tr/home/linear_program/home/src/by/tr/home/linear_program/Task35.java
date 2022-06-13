package by.tr.home.linear_program;

/*Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N*/

public class Task35 {

	public static void main(String[] args) {

		int m;
		int n;
		double division;
		double highestDigit;
		double lowDigit;

		m = 476;
		n = 29;

		division = m * 1.0 / n;

		highestDigit = (int) ((division - (int) division) * 10) % 10;
		lowDigit = ((int) division) % 10;

		System.out.println("M /N = " + division);
		System.out.println("Старшая цифра дробной части = " + highestDigit);
		System.out.println("Младшая цифра целой части = " + lowDigit);

	}

}
