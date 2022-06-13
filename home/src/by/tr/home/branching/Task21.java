package by.tr.home.branching;

import java.util.Scanner;

/*Программа — льстец. На экране высвечивается вопрос 
 * «Кто ты: мальчик или девочка? Введи Д или М». В зависимости от ответа 
 * на экране должен появиться текст «Мне нравятся девочки!» или 
 * «Мне нравятся мальчики!»*/

public class Task21 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Кто ты: мальчик или девочка? Введи Д или М");

		String str = sc.next();

		str = str.toUpperCase();

		if (str.equals("М")) {
			System.out.println("Мне нравятся мальчики!");
			
		} else if (str.equals("Д")) {
			System.out.println("Мне нравятся девочки!");
			
		} else {
			System.out.println("Введены неверные параметры");
		}

	}

}
