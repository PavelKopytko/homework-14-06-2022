package by.tr.home.linear_program;

/*Написать код для решения задачи. В n малых бидонах 80 л молока. 
 * Сколько литров молока в m больших бидонах, если в каждом большом бидоне 
 * на 12 л. больше, чем в малом?*/

public class Task06 {

	public static void main(String[] args) {

		int n;
		int m;
		double volumeOneN;
		double volumeOneM;
		double volumeN;
		double volumeM;

		n = 4;
		m = 5;
		volumeN = 80;

		volumeOneN = volumeN / n;
		volumeOneM = volumeOneN + 12;
		volumeM = volumeOneM * m;

		System.out.println("Count milk in " + m + " = " + volumeM);

	}

}
