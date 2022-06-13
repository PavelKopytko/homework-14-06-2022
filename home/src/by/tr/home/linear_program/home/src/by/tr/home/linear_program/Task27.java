package by.tr.home.linear_program;

/*Дано значение a. Не используя никаких функций и никаких операций, 
 * кроме умножения, получить значение а8 за три операции и а10 за четыре операции*/

public class Task27 {

	public static void main(String[] args) {

		int a;
		int a2;
		int a4;
		int a8;
		int a10;

		a = 2;

		a2 = a * a;
		a4 = a2 * a2;
		a8 = a4 * a4;

		a10 = a8 * a2;

		System.out.println("a8 = " + a8);
		System.out.println("a10 = " + a10);

	}

}
