import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // 들어올 값의 갯수
        int[] dp = new int[11]; // 11보다 작기 때문에

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());

            dp[1] = 1; // 1로 구성하는 방법 1가지
            dp[2] = 2;
            dp[3] = 4;

            for(int j = 4; j <= n; j++) {
                dp[j] = dp[j - 1] + dp[j - 2] + dp[j-3];
            }
            // 1을 만드는 경우{1}
            // 2를 만드는 경우{1+1, 2}
            // 3을 만드는 경우{1+1+1, 1+2, 2+1, 3}
            // 4를 만드는 경우{1+1+1+1, 1+1+2, 1+2+1, 2+1+1, 2+2, 1+3, 3+1}
            // 5를 만드는 경우{1+1+1+1+1, 1+1+1+2, 1+1+2+1, 1+2+1+1, 2+1+1+1, 1+1+3, 1+3+1, 3+1+1, 2+2+1, 2+1+2, 1+2+2, 2+3, 3+2}
            /**
             * dp [n] = dp [n-1] + dp [n-2] + dp [n-3]이라는 식을 세울 수 있다.
             */
            System.out.println(dp[n]);
        }
    }

}
