package by.tr.home.branching;

/*Даны три числа a, b, с. Определить, какое из них равно d. Если ни 
 * одно не равно d, то найти max(d — a, d — b, d — c)*/

public class Task28 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int d;

		a = 5;
		b = 3;
		c = 4;
		d = 6;

		if (a == d) {
			System.out.println("Число a = d = " + d);
		} else if (b == d) {
			System.out.println("Число a = d = " + d);
		} else if (c == d) {
			System.out.println("Число a = d = " + d);
		} else {
			System.out.println("max(d — a, d — b, d — c) = " + Math.max(Math.max(d - a, d - b), d - c));
		}
	}

}
