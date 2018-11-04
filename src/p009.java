/*
	A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
	a^2 + b^2 = c^2

	For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

	There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	Find the product abc.
*/
public class p009 {

	public static void main(String[] args) {

		for (int a = 1; a < 500; a++) {
			for (int b = 1; b < 500; b++) {
				for (int c = 1; c < 500; c++) {
					if ((int)Math.pow(a, 2) + (int)Math.pow(b, 2) == (int)Math.pow(c, 2) &&
							a + b + c == 1000) {
						System.out.println(a * b * c);
						System.exit(0);
					}
				}
			}
		}
	}
}
