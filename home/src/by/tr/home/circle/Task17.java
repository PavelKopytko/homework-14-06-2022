package by.tr.home.circle;

/*Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)*/

public class Task17 {

	public static void main(String[] args) {

		double a;
		int n;
		double multiplication = 1;

		a = 1.1;
		n = 5;

		for (int i = 0; i < n; i++) {
			multiplication *= (a + i);
		}
		System.out.println(multiplication);

	}

}
