import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int GCD(int a, int b) { //최대공약수를 구하는 재귀용법
        if (a%b == 0) return b;
        return GCD(b, a%b);
    }

    public static int GCD2(int a, int b) {
        while(true) {
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

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int gcd = GCD2(A, B);

        System.out.println(gcd); //최대공약수
        System.out.println((A * B) / gcd); //최소공배수
    }
}