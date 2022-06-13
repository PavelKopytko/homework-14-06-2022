package by.tr.home.linear_program;

/*Три сопротивления R1, R2 и R3 соединены параллельно. Найдите сопротивление соединения*/

public class Task30 {

	public static void main(String[] args) {

		double r1;
		double r2;
		double r3;
		double r;

		r1 = 5.1;
		r2 = 1.2;
		r3 = 2.4;

		r = Math.pow(1 / r1 + 1 / r2 + 1 / r3, -1);

		System.out.println("Общее сопротивление цепи :" + r);
	}

}
