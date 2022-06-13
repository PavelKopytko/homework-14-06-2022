package by.tr.home.branching;

/*Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с,
 *  и заменить их абсолютными значениями, если это не так.*/

public class Task30 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;

		a = 5.4;
		b = -5;
		c = -6.0;

		if (a > b && b > c) {
			a *= 2;
			b *= 2;
			c *= 2;
		} else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
		}
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);

	}

}
