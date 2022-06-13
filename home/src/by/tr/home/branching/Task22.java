package by.tr.home.branching;

/*Перераспределить значения переменных х и у так, чтобы в х оказалось 
 * большее из этих значений, а в y - меньшее*/

public class Task22 {

	public static void main(String[] args) {

		double x;
		double y;
		double temp;

		x = 5;
		y = 8;

		if (x < y) {
			temp = x;
			x = y;
			y = temp;

		}

		System.out.println("x = " + x);
		System.out.println("y = " + y);

	}

}
