package by.tr.home.circle;

/*Получить все числа, не превышающие заданного числа N, которые делятся без остатка на все свои
цифры*/

public class Task40 {

	public static void main(String[] args) {

		int number;
		number = 206;

		for (int i = 1; i <= number; i++) {

			int saveI;
			saveI = i;
			int n = i;
			int count = 0;
			int countDigit = 0;
			do {
				countDigit++;
				n = saveI % 10;

				if (n != 0) {
					if (i % n == 0) {
						count++;
					}
				}

				saveI /= 10;
			} while (saveI > 0);

			if (count == countDigit) {
				System.out.println(i);
			}

		}
	}

}
