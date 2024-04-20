import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 소인수분해를 해야 한다.
        // 2부터 N까지 나누어 떨어지는 수를 찾아야 한다.
        // 나누어 떨어지는 수를 찾으면 N을 나누어 떨어지는 수로 나누고 그 수를 출력한다.
        for (int i = 2; i <= N; i++) {
            while (N % i == 0) {
                System.out.println(i);
                N /= i;
            }
        }
    }
}