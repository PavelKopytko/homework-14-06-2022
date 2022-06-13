package by.tr.home.linear_program;

/*Дана длина ребра куба. Найти площадь грани, площадь полной 
 * поверхности и объем этого куба*/

public class Task18 {

	public static void main(String[] args) {

		double a;
		double areaSide;
		double areaCube;
		double volumeCube;

		a = 5.0;

		areaSide = a * a;
		areaCube = areaSide * 6;
		volumeCube = a * a * a;

		System.out.println("side area = " + areaSide);
		System.out.println("cube area = " + areaCube);
		System.out.println("cube volume = " + volumeCube);
	}

}
