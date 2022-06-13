package by.tr.home.linear_program;

/*Найти площадь равнобедренной трапеции с основаниями а и b и углом α при большем основании а*/

public class Task24 {

	public static void main(String[] args) {

		double a;
		double b;
		double alfa;
		double height;
		double area;

		a = 5.0;
		b = 3.0;
		alfa = 0.51;

		height = Math.tan(alfa) * (a - b) / 2;

		area = (a + b) / 2 * height;

		System.out.println("Площадь = " + area);

	}

}
