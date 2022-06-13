package by.tr.home.circle;

/*Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1 Составьте программу
нахождения произведения первых 10 членов этой последовательности*/

public class Task12 {

	public static void main(String[] args) {

		long multiplication = 1;
		int a = 1;

		for (int i = 1; i <= 10; i++) {

			multiplication *= a;
			a += 6;
		}
		System.out.println("multiplication = " + multiplication);
	}

}
