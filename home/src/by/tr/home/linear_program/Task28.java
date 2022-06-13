package by.tr.home.linear_program;

/*Составить программу перевода радианной меры угла в градусы, минуты и секунды*/

public class Task28 {

	public static void main(String[] args) {

		double alfaRad;
		double alfaGrad;
		double minute;
		double seconds;

		alfaRad = 2.5;

		alfaGrad = 180 * alfaRad / Math.PI;

		minute = alfaGrad % ((int) alfaGrad) * 60;
		seconds = minute % ((int) minute) * 60;

		System.out.printf("В %.2f радианах %d градусов %d минут %d секунд\n", alfaRad, (int) alfaGrad, (int) minute,
				(int) seconds);

//		System.out.println(alfaGrad);
//		System.out.println(minute);
//		System.out.println(seconds);
	}

}
