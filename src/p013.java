import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

/**
 * Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
 * (numbers can be found in "data/p013.txt")
 */

public class p013 {

    public static final String file = "data/p013.txt";

    public static void main(String[] args) {

        BufferedReader input;
        try {
            input = new BufferedReader(new FileReader(file));
        } catch (IOException e) {
            System.err.println("Error opening file");
            return;
        }

        BigInteger sum = new BigInteger("0");

        try {
            String s = input.readLine();
            while (s != null) {
                sum = sum.add(new BigInteger(s));
                s = input.readLine();
            }
        } catch (IOException e) {
                System.err.println("Error reading file");
        }

        System.out.println(sum.toString().substring(0,10));
        
        try {
            input.close();
        } catch (IOException e) {
            System.err.println("Error closing file");
        }
    }
}

