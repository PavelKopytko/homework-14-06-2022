package by.tr.home.circle;

/*Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n*/

public class Task14 {

	public static void main(String[] args) {

		int n;
		double function = 1;

		n = 10;

		for (int i = 2; i <= n; i++) {

			function += Math.pow(i, -1);

		}

		System.out.println("function = " + function);

	}
}