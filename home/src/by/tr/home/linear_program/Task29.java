package by.tr.home.linear_program;

/*Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с*/

public class Task29 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;

		double alfaRad, betaRad, gamaRad;
		double alfaGrad, betaGrad, gamaGrad;

		a = 3.0;
		b = 4.0;
		c = 5.0;

		alfaRad = Math.acos((a * a + c * c - b * b) / 2 / a / c);
		alfaGrad = Math.toDegrees(alfaRad);
		betaRad = Math.asin((b * b + c * c - a * a) / 2 / b / c);
		betaGrad = Math.toDegrees(betaRad);
		gamaGrad = 180 - alfaGrad - betaGrad;
		gamaRad = Math.toRadians(gamaGrad);

		System.out.println("угол №1 в рад." + alfaRad);
		System.out.println("угол №1 в град." + alfaGrad);
		System.out.println("угол №2 в рад." + betaRad);
		System.out.println("угол №2 в град." + betaGrad);
		System.out.println("угол №3 в рад." + gamaRad);
		System.out.println("угол №3 в град." + gamaGrad);

//		System.out.println(gamaGrad + alfaGrad + betaGrad);

	}

}
