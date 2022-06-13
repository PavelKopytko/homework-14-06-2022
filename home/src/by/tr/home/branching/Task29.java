package by.tr.home.branching;

/*Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они 
 * расположены на одной прямой*/

public class Task29 {

	public static void main(String[] args) {

		int x1, y1;
		int x2, y2;
		int x3, y3;

		x1 = 1;
		y1 = 1;
		x2 = 1;
		y2 = 5;
		x3 = 1;
		y3 = 4;

		if ((x3 - x1) * (y2 - y1) == (x2 - x1) * (y3 - y1)) {
			System.out.println("Точки лежат на одной прямой");
		} else {
			System.out.println("Точки не лежат на одной прямой");
		}

	}

}
