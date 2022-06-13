package by.tr.home.linear_program;

/*Составить программу для вычисления пути, пройденного лодкой, если ее скорость в стоячей воде v км/ч, скорость
течения реки v1 км/ч, время движения по озеру t1 ч, а против течения реки — t2 ч*/

public class Task31 {

	public static void main(String[] args) {

		double boatSpeed;
		double riverSpeed;
		double lakeTime;
		double riverTime;
		double distance;

		boatSpeed = 15;
		riverSpeed = 2;
		lakeTime = 1.5;
		riverTime = 2;

		distance = boatSpeed * lakeTime + (boatSpeed - riverSpeed) * riverTime;

		System.out.println("Лодка пройдет расстояние " + distance);

	}

}
