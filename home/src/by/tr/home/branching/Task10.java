package by.tr.home.branching;

/*Составить программу, которая определит площадь какого круга меньше*/

public class Task10 {

	public static void main(String[] args) {

		double radiusFirst;
		double radiusSecond;

		radiusFirst = 5;
		radiusSecond = 4;

		if (Math.PI * radiusFirst * radiusFirst < Math.PI * radiusSecond * radiusSecond) {
			
			System.out.println("Площадь круга с радиусом " + radiusFirst + " меньше");
			
		} else {
			
			System.out.println("Площадь круга с радиусом " + radiusSecond + " меньше");
			
		}

	}

}
