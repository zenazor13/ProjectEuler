/*

	2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

	What is the sum of the digits of the number 2^1000?

 */

import java.math.BigInteger;

public class p016 {

	public static void main(String[] args) {

		BigInteger bigInt = new BigInteger("2").pow(1000);
		String hugeInt = bigInt.toString();
		long total = 0;

		for (int i = 0; i < hugeInt.length(); i++) {
			total += Integer.parseInt(hugeInt.substring(i, i + 1));
		}

		System.out.println(total);
	}

}
