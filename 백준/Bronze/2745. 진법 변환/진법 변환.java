
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputArray = br.readLine().split(" ");
        String N = inputArray[0];
        int B = Integer.parseInt(inputArray[1]);

        int convertResult = 0;

        for(int i = 0; i < N.length(); i++) {
            char BChar = N.charAt(N.length() - i - 1);

            if (BChar >= 'A') { // 문자인 경우
                convertResult += (int) ((BChar - 'A' + 10) * Math.pow(B, i));
            } else {
                convertResult += (int) ((BChar - '0') * Math.pow(B, i));
            }
        }

        System.out.println(convertResult);
    }
}
