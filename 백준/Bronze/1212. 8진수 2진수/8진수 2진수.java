
import java.math.BigInteger;
import java.io.*;


public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();

        BigInteger octNumber = new BigInteger(N, 8);
        String binaryString = octNumber.toString(2);

        System.out.println(binaryString);

    }
}