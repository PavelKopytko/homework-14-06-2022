package by.tr.home.linear_program;

/*Даны два действительных числа х и у. Вычислить их сумму, разность, произведение и частное*/

public class Task01 {

	public static void main(String[] args) {
		double x;
		double y;
		double sum;
		double difference;
		double multiplication;
		double division;

		x = 1.2;
		y = 0.5;

		sum = x + y;
		difference = x - y;
		multiplication = x * y;
		division = x / y;

		System.out.println("sum = " + sum);
		System.out.println("difference = " + difference);
		System.out.println("multiplication = " + multiplication);
		System.out.println("division = " + division);
	}

}
