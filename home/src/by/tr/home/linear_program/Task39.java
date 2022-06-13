package by.tr.home.linear_program;

/*Дано действительное число х. Не пользуясь никакими другими арифметическими операциями, кроме умножения,
сложения и вычитания, вычислите за минимальное число операций 2x4 - 3х3 + 4х2 - 5х + 6*/

public class Task39 {

	public static void main(String[] args) {

		double x;
		double result;

		x = 1;

		result = x * x * (2 * x * x - 3 * x + 4) - 5 * x + 6;

		System.out.println("result = " + result);

	}

}
