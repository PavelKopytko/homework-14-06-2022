package by.tr.home.branching;

/*Написать программу — модель анализа пожарного датчика в помещении, которая 
 * выводит сообщение «Пожароопасная ситуация », если температура в комнате 
 * превысила 60° С*/

public class Task25 {

	public static void main(String[] args) {
		double temperature;

		do {
			temperature = Math.random() * 70;

			System.out.printf("Температура: %.2f \n", temperature);

		} while (temperature <= 60);

		System.out.println("Пожароопасная ситуация");

	}

}
