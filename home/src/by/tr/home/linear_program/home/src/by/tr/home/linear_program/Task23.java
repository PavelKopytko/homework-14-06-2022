package by.tr.home.linear_program;

/*Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r)*/

public class Task23 {

	public static void main(String[] args) {
		double smallR;
		double bigR;
		double ringArea;

		smallR = 3.0;
		bigR = 5.0;

		ringArea = Math.PI * (bigR * bigR - smallR * smallR);

		System.out.println("Площадь кольца = " + ringArea);

	}

}
