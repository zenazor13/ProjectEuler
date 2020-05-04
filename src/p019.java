import java.math.BigInteger;

/**
 * n! means n × (n − 1) × ... × 3 × 2 × 1
 *
 *  For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 *  and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 *
 * Find the sum of the digits in the number 100!
 */

public class p019 {

    public static void main(String[] args) {

        BigInteger n = Euler.factorial(new BigInteger("100"));
        String s = n.toString();
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(Character.toString(s.charAt(i)));
        }

        System.out.println("sum = " + sum);
    }
}
