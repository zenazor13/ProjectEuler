import java.math.BigInteger;

public class Euler {

    public static BigInteger factorial(BigInteger n) {
        BigInteger fact = new BigInteger("1");

        for (int i = Integer.parseInt(n.toString()); i > 0; i--) {
            fact = fact.multiply(new BigInteger(Integer.toString(i)));
        }

        return fact;
    }

}
