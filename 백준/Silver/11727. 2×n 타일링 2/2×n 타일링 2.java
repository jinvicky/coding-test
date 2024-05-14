import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int j = Integer.parseInt(br.readLine());

        int[] dp = new int[1001]; // j는 1000보다 작거나 같다.
        dp[1] = 1;
        dp[2] = 3; // 여기서 틀린걸까
        dp[3] = 5;

        for (int k = 4; k <= j; k++) {
            dp[k] = (dp[k - 1] + dp[k - 2] * 2) % 10007;
        }
        System.out.println(dp[j]);
    }
}