package by.tr.home.linear_program;

/*Известна длина окружности. Найти площадь круга, ограниченного этой окружностью*/

public class Task20 {

	public static void main(String[] args) {

		double circleLenght;
		double circleArea;

		circleLenght = 5;

		circleArea = circleLenght * circleLenght / 4 / Math.PI;
		
		System.out.println("Площадь круга = " + circleArea);

	}

}
