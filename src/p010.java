/*
	The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

	Find the sum of all the primes below two million.
*/

public class p010 {

	public static void main(String[] args) {

		int prime = 3;
		long total = 2; //starts at 2 because nextPrime doesn't account for it

		while (prime < 2000000) {
			total += prime;
			prime = nextPrime(prime);
		}

		System.out.println(total);

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
