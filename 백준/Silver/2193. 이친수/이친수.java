import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
//        int[] dp = new int[91]; // 최대 N의 개수가 90이므로 
        
        long[] dp = new long[91];
        
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;
        for(int k = 4; k <= N; k++) {
            dp[k] = dp[k-1] + dp[k-2];
        }
        System.out.println(dp[N]);
    }
}