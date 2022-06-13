package by.tr.home.branching;

/*Написать программу, которая по заданным трем числам определяет, 
 * является ли сумма каких-либо двух из них положительной*/

public class Task32 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;

		a = 2.0;
		b = -3.0;
		c = -1;

		if (a + b > 0) {
			System.out.println("sum of " + a + " + " + b + " is positive");
		} else if (a + c > 0) {
			System.out.println("sum of " + a + " + " + c + " is positive");
		} else if (b + c > 0) {
			System.out.println("sum of " + b + " + " + c + " is positive");
		} else {
			System.out.println("positive sum is not found");
		}
	}

}
