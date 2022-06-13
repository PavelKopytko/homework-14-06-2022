package by.tr.home.branching;

/*Определить, делителем каких чисел а, b, с является число k*/

public class Task20 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int k;

		a = 5;
		b = 4;
		c = 10;
		k = 2;

		if (a % k == 0) {
			System.out.println("Число " + k + " является делителем числа " + a);
		}
		if (b % k == 0) {
			System.out.println("Число " + k + " является делителем числа " + b);
		}
		if (c % k == 0) {
			System.out.println("Число " + k + " является делителем числа " + c);
		}

	}

}
