package by.tr.home.branching;

/*Найти max{min(a, b), min(c, d)}*/

public class Task27 {

	public static void main(String[] args) {

		int a;
		int b;

		int c;
		int d;

		a = 5;
		b = 3;
		c = 6;
		d = 2;

		System.out.println(Math.max(Math.min(a, b), Math.min(c, d)));

	}

}
