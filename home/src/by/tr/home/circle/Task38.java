package by.tr.home.circle;

/*Для заданного натурального числа определить, образуют ли его цифры арифметическую
прогрессию. Предполагается, что в числе не менее трёх цифр. Например: 1357, 963*/

public class Task38 {

	public static void main(String[] args) {

		int number = 1357;
		int n;
		int saveN;
		int count = 0;
		int countOper = 0;
		int k;

		saveN = number;
		n = number;

		k = number % 10 - number % 100 / 10;

		do {
			count++;
			saveN = n % 10;
			n /= 10;
			if (n % 10 == saveN - k) {
				countOper++;
			}

		} while (n > 1);

		if (count == countOper) {

			System.out.println("Цифры числа " + number + " образуют арифметическую последовательность");
		} else {
			System.out.println("Цифры числа " + number + " не образуют арифметическую последовательность");
		}

	}

}
