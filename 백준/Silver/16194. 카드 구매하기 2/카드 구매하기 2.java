import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine());
       String[] data = br.readLine().split(" ");
       int[] dp = new int[n + 1];

       int MAX_VALUE = 10001; // 비용 최대가 10000이라서. 

       for (int i = 1; i <= n; i++) {
           dp[i] = Integer.parseInt(data[i - 1]);

           for (int j = 1; j <= i / 2; j++) {
               dp[i] = Math.min(dp[i], dp[j] + dp[i - j]);
           }
       }
        System.out.println(dp[n]);
    }
}