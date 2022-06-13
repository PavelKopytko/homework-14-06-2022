package by.tr.home.branching;

/*Составить программу, определяющую результат гадания на ромашке — 
 * «любит—не любит», взяв за исходное данное количество лепестков п*/

public class Task24 {

	public static void main(String[] args) {

		int n;

		n = (int) (Math.random() * 30 + 1);

//		System.out.println(n);

		if (n % 2 == 0) {
			System.out.println("Любит!");
		} else {
			System.out.println("Не любит :( ");
		}

	}

}
