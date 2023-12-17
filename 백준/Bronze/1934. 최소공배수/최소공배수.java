import java.io.*;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Main {
    public static int GCD(int a, int b) { //최대공약수를 구하는 재귀용법
        if (a % b == 0) return b;
        return GCD(b, a % b);
    }

    public static int GCD2(int a, int b) {
        while (true) {
            int value = a % b;
            if (value == 0) return b;
            else {
                //a는 한번만 연산하고, b값으로 덮어씌워진다.
                a = b;
                b = value;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "";
        while ((str = br.readLine()) != null) {

            // 1안. StringTokenizer
             StringTokenizer st = new StringTokenizer(str);
             if(st.countTokens() == 2) {
                 int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());
                int gcd = GCD2(A, B);
                System.out.println((A * B) / gcd);
             }
        }
    }
}