package by.tr.home.linear_program;

/*Найти произведение цифр заданного четырехзначного числа*/

public class Task16 {

	public static void main(String[] args) {

		int n = 1984;

		int first;
		int second;
		int third;
		int four;
		int saveN;

		saveN = n;

		four = saveN % 10;
		saveN /= 10;
		third = saveN % 10;
		saveN /= 10;
		second = saveN % 10;
		saveN /= 10;
		first = saveN;

		System.out.println("four = " + four);
		System.out.println("third = " + third);
		System.out.println("second = " + second);
		System.out.println("first = " + first);

		System.out.println("result = " + first * second * third * four);

	}

}
