/*
	The sum of the squares of the first ten natural numbers is,
	1^2 + 2^2 + ... + 10^2 = 385

	The square of the sum of the first ten natural numbers is,
	(1 + 2 + ... + 10)^2 = 55^2 = 3025

	Hence the difference between the sum of the squares of the first ten natural numbers
	and the square of the sum is 3025 − 385 = 2640.

	Find the difference between the sum of the squares of the first one hundred natural
	numbers and the square of the sum.
*/

public class p006 {

	public static void main(String[] args) {

		System.out.println(squareOfSums(100) - sumOfSquares(100));

	}

	private static int squareOfSums(int num) {
		int sum = 0;

		for (int i = 0; i <= num; i++) {
			sum += i;
		}

		sum = (int) Math.pow(sum, 2);
		return sum;
	}

	private static int sumOfSquares(int num) {
		int sum = 0;

		for (int i = 0; i <= num; i++) {
			sum += (int) Math.pow(i, 2);
		}

		return sum;
	}
}
