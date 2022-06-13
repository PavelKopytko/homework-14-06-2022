package by.tr.home.linear_program;

/*Для данных областей составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае:*/

public class Task38 {

	public static void main(String[] args) {

		double m;
		double n;

		m = 2;
		n = 3;

		// triangle

		if (m >= -4 && m <= 0 && n >= 0 && n <= 4) {
			System.out
					.println("Точка с координатами (" + m + "," + n + ") лежит в области треугольника " + (n <= m + 4));
		} else if (m >= 0 && m <= 4) {
			System.out.println(
					"Точка с координатами (" + m + "," + n + ") лежит в области треугольника " + (n <= -m + 4));
		} else {
			System.out.println("Точка лежит за пределами области треугольника");
		}

		// circle

		if (m >= 0 && m <= 4 && n >= 0 && n <= 4) {

			System.out.println(
					"Точка с координатами (" + m + "," + n + ") лежит в области сектора " + (16 >= m * m + n * n));

		} else if (m >= 0 && m <= 5 && n >= -5 && n <= 5) {

			System.out.println(
					"Точка с координатами (" + m + "," + n + ") лежит в области сектора " + (25 >= m * m + n * n));
		} else {
			System.out.println("Точка лежит за пределами секторов кругов");
		}

	}

}
