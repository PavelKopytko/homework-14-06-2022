package by.tr.home.linear_program;

/*Найти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у*/

public class Task26 {

	public static void main(String[] args) {

		double a;
		double b;
		double y;
		double area;

		a = 3.0;
		b = 2.0;
		y = 127;

		area = 1.0 / 2 * a * b * Math.sin(Math.toRadians(y));

		System.out.println("Площадь = " + area);

	}

}
