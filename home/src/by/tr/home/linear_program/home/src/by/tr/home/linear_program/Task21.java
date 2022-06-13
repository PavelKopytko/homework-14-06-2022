package by.tr.home.linear_program;

/*Дано действительное число R вида nnn.ddd (три цифровых разряда 
 * в дробной и целой частях). Поменять местами дробную и целую части числа 
 * и вывести полученное значение числа*/

public class Task21 {

	public static void main(String[] args) {

		double r;
		double newR;

		r = 123.456;

		int nnn;
		double ddd;

		nnn = (int) r;
		ddd = r * 1000 % 1000;

		newR = ddd + nnn / 1000.0;

		System.out.println("Первоначальное число = " + r);
		System.out.println("Новое число = " + newR);
	}

}
