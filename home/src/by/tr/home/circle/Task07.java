package by.tr.home.circle;

/*Вычислить значения функции на отрезке [а,b] c шагом h*/

public class Task07 {

	public static void main(String[] args) {

		int a;
		int b;
		int h;
		int function;

		a = -5;
		b = 5;
		h = 1;

		for (int i = a; i <= b; i += h) {

			if (i > 2) {
				function = i;
			} else {
				function = -i;
			}
			System.out.println("function = " + function);
		}

	}

}
