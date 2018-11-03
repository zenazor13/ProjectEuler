/*
	By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

	What is the 10,001st prime number?
*/

public class p007 {

	public static void main(String[] args) {

		int prime = 3;

		for (int i = 0; i < 9999; i++) {
			prime = nextPrime(prime);
		}

		System.out.println(prime);

	}

	private static int nextPrime(int lastPrime) {

		int num = lastPrime + 2;

		while (!isPrime(num)) {
			num += 2;
		}

		return num;

	}

	private static boolean isPrime(int num) {

		//check if num is even
		if (num % 2 == 0) {
			return false;
		}

		//check if num is divisible by anything up to its square root
		for (int i = 3; i * i <= num; i += 2) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;

	}
}
