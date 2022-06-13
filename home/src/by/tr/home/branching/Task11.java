package by.tr.home.branching;

/*Составить программу, которая определит площадь какого треугольника больше*/

public class Task11 {

	public static void main(String[] args) {

		double a1, b1, c1;
		double a2, b2, c2;

		double p1, p2;

		double square1, square2;

		a1 = 2;
		b1 = 3;
		c1 = 4;

		a2 = 3;
		b2 = 2;
		c2 = 2;
		
		// опустим проверку на существование треугольников

		p1 = getP(a1, b1, c1);
		p2 = getP(a2, b2, c2);

		square1 = Math.sqrt(p1 * (p1 - a1) * (p1 - b1) * (p1 - c1));
		square2 = Math.sqrt(p2 * (p2 - a2) * (p2 - b2) * (p2 - c2));

		if (square1 > square2) {

			System.out.println("Площадь треугольника со сторонами " + a1 + ", " + b1 + ", " + c1 + ", " + " больше");

		} else if (square1 < square2){

			System.out.println("Площадь треугольника со сторонами " + a2 + ", " + b2 + ", " + c2 + ", " + " больше");

		} else {
			System.out.println("Площади равны");

		}

	}

	private static double getP(double a, double b, double c) {
		return (a + b + c) / 2;
	}

}
