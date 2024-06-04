import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
//        String[] arr = "6 4".split(" ");
//        int n = Integer.parseInt(arr[0]);
//        int k = Integer.parseInt(arr[1]);
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);
        int MOD = 1000_000_000;

        int[][] dp = new int[k+1][n+1];
        Arrays.fill(dp[1], 1);
        for (int i = 1; i <= k; i++) dp[i][0] = 1;

        for (int i = 2; i <= k; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
                dp[i][j] %= MOD;
            }
        }
        System.out.println(dp[k][n]);
    }
}