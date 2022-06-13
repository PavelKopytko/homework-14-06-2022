package by.tr.home.linear_program;

/*Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами a, b и с (предполагается,
что а≠0 и что дискриминант уравнения неотрицателен)*/

public class Task25 {

	public static void main(String[] args) {

		double a, b, c;
		double x1, x2;

		double discriminant;

		a = 1.0;
		b = 2.0;
		c = -3.0;

		discriminant = b * b - 4 * a * c;

		x1 = (-b + Math.sqrt(discriminant)) / 2 / a;
		x2 = (-b - Math.sqrt(discriminant)) / 2 / a;

		System.out.println("Корни уравнения " + x1 + ", " + x2);
	}

}
