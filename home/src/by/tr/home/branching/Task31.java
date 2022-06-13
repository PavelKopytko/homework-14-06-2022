package by.tr.home.branching;

/*Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, 
 * пройдет ли кирпич через отверстие*/

public class Task31 {

	public static void main(String[] args) {

		double a;
		double b;
		double x;
		double y;
		double z;

		a = 121;
		b = 121;

		x = 250;
		y = 120;
		z = 65;

		if ((x < a && y < b) || (x < b && y < a)) {
			System.out.println("Пройдет ");
		} else if ((y < a && z < b) || (z < b && y < a)) {
			System.out.println("Пройдет ");
		} else if ((x < a && z < b) || (z < b && x < a)) {
			System.out.println("Пройдет ");
		} else {
			System.out.println("Не пройдет");
		}

	}

}
