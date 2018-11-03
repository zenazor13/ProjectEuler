/*
	The prime factors of 13195 are 5, 7, 13 and 29.

	What is the largest prime factor of the number 600851475143 ?
*/

public class p003 {

	private static long bignum = 600851475143L;

	public static void main(String[] args) {

		long prime = 3;
		long num = bignum;

		while (!isPrime(num)) {
			if (isFactor(prime, num)) {
				num = num / prime;
			}
			else {
				prime = nextPrime(prime);
			}
		}

		System.out.println(num);
	}

	private static long nextPrime(long lastPrime) {

		long num = lastPrime + 2;

		while (!isPrime(num)) {
			num += 2;
		}

		return num;
	}

	private static boolean isPrime(long num) {

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

	private static boolean isFactor(long prime, long num) {

		if (num % prime == 0) {
			return true;
		}

		return false;
	}
}
