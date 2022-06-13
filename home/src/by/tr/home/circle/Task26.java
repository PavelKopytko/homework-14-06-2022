package by.tr.home.circle;

/*Вывести на экран соответствий между символами и их численными обозначениями в памяти
компьютера (Таблицу ASCII)*/

public class Task26 {

	public static void main(String[] args) {

		for (int i = 0; i < 256; i++) {
			
			System.out.println("Номер " + i + ",символ: " + (char) i);
		}

	}

}
