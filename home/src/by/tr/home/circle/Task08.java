package by.tr.home.circle;

/*Вычислить значения функции на отрезке [а,b] c шагом h*/

public class Task08 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int function;
		int h;

		a = 10;
		b = 20;
		h = 1;
		c = 3;

		for (int i = a; i <= b; i += h) {

			if (i == 15) {
				function = (i + c) * 2;
			} else {
				function = (i - c) + 6;
			}
			System.out.println("function = " + function);
		}

	}

}
