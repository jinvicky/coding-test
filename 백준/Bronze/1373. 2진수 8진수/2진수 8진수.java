import java.math.BigInteger;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();

        BigInteger binaryNumber = new BigInteger(N, 2);
        String octString = binaryNumber.toString(8);
        System.out.println(octString);
    }
}