package by.tr.home.linear_program;

/*Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное
значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc*/

public class Task22 {

	public static void main(String[] args) {

		int timeInSeconds;
		int hour;
		int minute;
		int seconds;

		timeInSeconds = 3665;

		hour = timeInSeconds / 3600;
		minute = (timeInSeconds - hour * 3600) / 60;
		seconds = timeInSeconds % 60;

		System.out.println("В " + timeInSeconds + " секундах: " + hour + "ч. " + minute + "мин. " + seconds + "сек.");

	}

}
