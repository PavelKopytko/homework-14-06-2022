package by.tr.home.linear_program;

/*Текущее показание электронных часов: т ч (0 ≤ m ≤23) п мин (0 ≤ n ≤59) к с (0 ≤k ≤59). 
 * Какое время будут показывать часы через р ч q мин r с*/

public class Task32 {

	public static void main(String[] args) {

		int m;
		int n;
		int k;
		int p;
		int q;
		int r;

		m = 5;
		n = 25;
		k = 30;

		p = 19;
		q = 31;
		r = 42;

		int saveM = m;
		int saveN = n;
		int saveK = k;

		System.out.println("Начальное время " + m + " ч. " + n + " мин. " + k + " сек.\n");
		System.out.println("Добавляемое время " + p + " ч. " + q + " мин. " + r + " сек.\n");

		saveK += r;
		if (saveK >= 60) {
			saveK = saveK - 60;
			saveN += (k + r) / 60;
		}
		saveN += q;
		if (saveN >= 60) {
			saveN = saveN - 60;
			saveM += (n + q) / 60;
		}
		saveM += p;
		if (saveM >= 24) {
			System.out.println("Начались новые сутки");
			saveM -= 24;
		}

		System.out.println("Конечное время " + saveM + " ч. " + saveN + " мин. " + saveK + " сек.");

	}

}
