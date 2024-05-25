import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 수열 A의 크기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] input = new int[N];
        int[] dp = new int[N];

        for(int i = 0; i < N; i++) {
            dp[i] = 1;
            input[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < N; i++) {
            for(int j = 0; j < i; j++) {
                int me = input[i];
                int before = input[j];

                if (me > before) {
                    int meDp = dp[i];
                    int beforeDp = dp[j];
                    dp[i] = Math.max(meDp, beforeDp + 1);
                }
            }
        }

        int maxCount = 0;
        for(int i = 0; i < N; i++) {
            maxCount = Math.max(maxCount, dp[i]);
        }
        System.out.println(maxCount);
    }
}