package by.tr.home.circle;

/*Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15*/

public class Task34 {

	public static void main(String[] args) {

		for (int i = 1000; i <= 9999; i++) {

			int first;
			int second;
			int third;
			int four;
			int saveN;

			saveN = i;

			four = saveN % 10;
			saveN /= 10;
			third = saveN % 10;
			saveN /= 10;
			second = saveN % 10;
			saveN /= 10;
			first = saveN;

			if (four + third + second + first == 15) {
				System.out.println(i);
			}

		}

	}

}
