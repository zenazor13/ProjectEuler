/*
	If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are
	3 + 3 + 5 + 4 + 4 = 19 letters used in total.

	If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words,
	how many letters would be used?

	NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and
	115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance
	with British usage.
*/

public class p017 {

	public static void main(String[] args) {

		String[] onesLength = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String[] teensLength = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
				"eighteen", "nineteen"};
		String[] tensLength = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		String hundredLength = "hundred";
		String thousandLength = "thousand";
		String andLength = "and";
		int totalLength = 0;

		for (int i = 0; i <= 1000; i++) {

			int ones = i % 10;
			int tens = (i % 100) / 10;
			int hundreds = (i % 1000) / 100;

			if (tens == 1) {
				totalLength += teensLength[ones].length();
			} else {
				totalLength += tensLength[tens].length() + onesLength[ones].length();
			}

			if (hundreds > 0) {
				if (ones != 0 || tens != 0) {
					totalLength += onesLength[hundreds].length() + hundredLength.length() + andLength.length();
				}
				else {
					totalLength += onesLength[hundreds].length() + hundredLength.length();
				}
			}

			if (i == 1000) {
				totalLength += onesLength[1].length() + thousandLength.length();
			}

		}

		System.out.println("totalLength = " + totalLength);

	}
}
