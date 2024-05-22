import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int modular = 9901;

        int[][] dp = new int[n + 1][2];
        dp[1][0] = 1;
        dp[1][1] = 2;

        for(int i = 2; i <= n; i++) {
            dp[i][0] = (dp[i-1][0] + dp[i-1][1]) % modular;
            dp[i][1] = (dp[i-1][0] * 2 + dp[i-1][1]) % modular;
        }
        System.out.println((dp[n][0] + dp[n][1]) % modular);
    }
}