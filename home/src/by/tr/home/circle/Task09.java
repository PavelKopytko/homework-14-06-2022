package by.tr.home.circle;

/*Найти сумму квадратов первых ста чисел*/

public class Task09 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 0; i <= 100; i++) {
			sum += i * i;
		}
		System.out.println("sum = " + sum);
	}

}
