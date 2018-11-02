/*
	2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

	What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/
public class p005 {

	public static void main(String[] args) {

		int test = 2520;

		while (!divisible(test)) {
			test += 20;
		}

		System.out.println(test);
	}

	private static boolean divisible(int num) {

		for (int i = 1; i <= 20; i++) {
			if (num % i != 0) {
				return false;
			}
		}
		return true;
	}


}
