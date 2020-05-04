import java.math.BigInteger;

/**
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
 * there are exactly 6 routes to the bottom right corner.
 *
 * How many such routes are there through a 20×20 grid?
 */

public class p015 {

    public static void main(String[] args) {

        BigInteger n = new BigInteger("40");
        BigInteger k = new BigInteger("20");


        // Separate numerator and denominator to make things a bit cleaner
        BigInteger numerator = Euler.factorial(n);
        BigInteger denominator = Euler.factorial(k).multiply(Euler.factorial(n.subtract(k)));
        BigInteger total = numerator.divide(denominator);
        System.out.println("total = " + total);
    }

}
