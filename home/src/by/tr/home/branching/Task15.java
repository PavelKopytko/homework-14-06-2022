package by.tr.home.branching;

/*Даны действительные числа х и у, не равные друг другу. Меньшее из этих 
 * двух чисел заменить половиной их суммы, а большее — их удвоенным произведением*/

public class Task15 {

	public static void main(String[] args) {

		double a;
		double b;

		double halfOfSum;
		double doubleMult;

		a = 6.2;
		b = 1;

		halfOfSum = (a + b) / 2;
		doubleMult = 2 * a * b;

		if (a < b) {
			a = halfOfSum;
			b = doubleMult;
		} else {
			a = doubleMult;
			b = halfOfSum;
		}

		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

}
