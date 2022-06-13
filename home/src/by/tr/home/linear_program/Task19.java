package by.tr.home.linear_program;

/*Дана сторона равностороннего треугольника. Найти площадь этого треугольника, 
 * его высоту, радиусы вписанной и описанной окружностей*/

public class Task19 {

	public static void main(String[] args) {

		double triangleSide;
		double triangleArea;
		double triangleHight;
		double radiusSmall;
		double radiusBig;

		triangleSide = 3;

		radiusSmall = Math.sqrt(3) / 6 * triangleSide;

		radiusBig = Math.sqrt(3) / 3 * triangleSide;

		triangleArea = 3 * Math.sqrt(3) * radiusSmall * radiusSmall;

		triangleHight = Math.sqrt(3) / 2 * triangleSide;

		System.out.println("Площадь = " + triangleArea);
		System.out.println("Высота = " + triangleHight);
		System.out.println("Радиус вписанной окружности = " + radiusSmall);
		System.out.println("Радиус описанной окружности = " + radiusBig);

	}

}
