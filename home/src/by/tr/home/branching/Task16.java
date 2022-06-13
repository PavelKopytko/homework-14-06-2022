package by.tr.home.branching;

/*На плоскости ХОY задана своими координатами точка А. Указать, где она 
 * расположена (на какой оси или в каком координатном угле)*/

public class Task16 {

	public static void main(String[] args) {

		double x;
		double y;

		x = 4;
		y = 3;

		if (x == 0 && y == 0) {
			System.out.println("Точка расположена в начале координат");

		} else if (x == 0) {
			System.out.println("Точка расположена на оси У");

		} else if (y == 0) {
			System.out.println("Точка расположена на оси X");
		}

		if (x > 0 && y > 0) {
			System.out.println("Точка расположена в I координатной четверти");
		}
		if (x < 0 && y > 0) {
			System.out.println("Точка расположена в II координатной четверти");
		}
		if (x < 0 && y < 0) {
			System.out.println("Точка расположена в III координатной четверти");
		}
		if (x > 0 && y < 0) {
			System.out.println("Точка расположена в IV координатной четверти");
		}

	}

}
