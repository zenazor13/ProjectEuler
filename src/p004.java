/*
	A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

	Find the largest palindrome made from the product of two 3-digit numbers.
*/

public class p004 {

	public static void main(String[] args) {

		int biggestPalindrome = 0;
		int testPalindrome;

		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				testPalindrome = i * j;
				if (isPalindrome(testPalindrome) && testPalindrome > biggestPalindrome) {
					biggestPalindrome = testPalindrome;
				}
			}
		}

		System.out.println(biggestPalindrome);

	}

	private static boolean isPalindrome(int num) {

		String forwards = Integer.toString(num);
		String backwards = new StringBuilder(forwards).reverse().toString();

		if (forwards.equals(backwards)) {
			return true;
		}

		return false;

	}

}
