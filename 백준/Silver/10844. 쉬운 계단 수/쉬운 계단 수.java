import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 1 <= N <= 100
        int modular = 1_000_000_000;
        long[][] dp = new long[N+1][10];

        int[] count = new int[N+1]; // 자릿수별로 count를 저장할 배열

        // 1번째 줄 초기화
        for(int k = 1; k <= 9; k++) {
            dp[1][k] = 1;
        }
        count[1] = 9; // 첫째줄은 무조건 9개니까.

        for(int i = 2; i <= N; i++) {
            for (int j = 0; j <= 9; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i-1][j+1] % modular;
                } else if (j == 9) {
                    dp[i][j] = dp[i-1][j-1] % modular;
                } else {
                    dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % modular;
                }
            }
        }
        long result = 0;

        // 여기서 틀림. 각 dp의 자릿수를 모두 더해야 함. 
        for(int i = 0; i < 10; i++) {
            result += dp[N][i];
        }

        System.out.println(result % modular);
    }
}