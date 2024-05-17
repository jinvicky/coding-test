import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] dp =  new int[N+1][10];
        int[] count = new int[N+1];
        count[1] = 10;
        for(int i = 0; i <= 9; i++) {
            dp[1][i] = 1;
        }
        // Arrays.fill(dp[1], 1);

        int modular = 10_007;

        for(int i = 2; i <= N; i++) {
            int sum = 1;
            dp[i][0] = 1; // 0으로 구성되는 경우는 자릿수 상관없이 1이기에
            for(int j = 1; j < 10; j++) {
                dp[i][j] = (dp[i][j-1] + dp[i-1][j]) % modular;
                sum+= dp[i][j];
            }
            count[i] = sum % modular;
        }
        System.out.println(count[N]);
    }
}