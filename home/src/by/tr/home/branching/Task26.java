package by.tr.home.branching;

/*Написать программу нахождения суммы большего и меньшего из трех чисел*/

public class Task26 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int max;
		int min;
		int sum;

		a = 9;
		b = 2;
		c = 1;

		if (a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		if (max < c) {
			max = c;
		}
		if (min > c) {
			min = c;
		}
		sum = max + min;
		
		System.out.println("Sum max + min = " + sum);

	}

}
