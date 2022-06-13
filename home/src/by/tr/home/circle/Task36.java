package by.tr.home.circle;

/*Два двузначных числа, записанных одно за другим , образуют четырёхзначное число, которое
делится на их произведение. Найти эти числа*/

public class Task36 {

	public static void main(String[] args) {

		for (int i = 10; i <= 99; i++) {
			for (int j = 10; j <= 99; j++) {

				int number;
				number = i * 100 + j;

				if (number % (i * j) == 0) {

					System.out.println(i + " , " + j);
				}
			}
		}
	}
}
