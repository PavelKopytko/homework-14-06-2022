package by.tr.home.circle;

/*Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10)*/

public class Task16 {

	public static void main(String[] args) {

		int a = 1;
		long multiplication = 1;

		for (int i = 2; i <= 10; i++) {

			a += i;
			multiplication *= a;
		}

		System.out.println(multiplication);
	}
}
