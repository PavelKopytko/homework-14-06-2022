package by.tr.home.linear_program;

/*Найти частное произведений четных и нечетных цифр четырехзначного числа*/

public class Task36 {

	public static void main(String[] args) {

		int number;
		double division;
		int multiplicationEven = 1;
		int multiplicationOdd = 1;

		number = 5222;

		int four = number % 10;
		if (four % 2 == 0) {
			multiplicationEven *= four;
		} else {
			multiplicationOdd *= four;
		}

		int three = (number % 100 - four) / 10;
		if (three % 2 == 0) {
			multiplicationEven *= three;
		} else {
			multiplicationOdd *= three;
		}

		int two = (number % 1000 - number % 100) / 100;
		if (two % 2 == 0) {
			multiplicationEven *= two;
		} else {
			multiplicationOdd *= two;
		}

		int one = number / 1000;
		if (one % 2 == 0) {
			multiplicationEven *= one;
		} else {
			multiplicationOdd *= one;
		}

		division = 1.0 * multiplicationEven / multiplicationOdd;

		System.out.println("Число " + number);

		System.out.println("Частное произведений четных и нечетных цифр: " + division);

//		System.out.println(four);
//		System.out.println(three);
//		System.out.println(two);
//		System.out.println(one);

	}

}
