import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 포도잔의 개수

        int[] arr = new int[N + 1];
        int[] dp = new int[N + 1];

        for(int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = arr[1];
        if (N > 1) {
            dp[2] = arr[1] + arr[2];
        }
        for (int i = 3; i <= N; i++) {
            int first = dp[i-2] + arr[i];
            int second = dp[i-3] + arr[i-1] + arr[i];
            int third = dp[i-1];

            dp[i] = max(first, second, third);
        }
        System.out.println(dp[N]);
    }

    static int max (int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}