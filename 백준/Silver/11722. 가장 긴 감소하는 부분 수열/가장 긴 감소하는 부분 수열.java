import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] input = new int[N];
        int[] dp = new int[N];

        for(int i = 0; i < N; i++) {
            // st로
            input[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N; i++) {
            // 일단 기본으로 dp[i]에 1 넣고 들어가! 최소 수열의 길이는 1이기 때문이다.
            dp[i] = 1;
            for(int j =0; j < i; j++) {
                /**
                 * 내가 i, 내 이전 애들이 j라고 했을때,
                 * input[i]가 input[j]보다 작고 + (dp[j] + 1)이 dp[i]보다 크다면
                 * dp[i] = dp[j] + 1
                 */
                if (input[i] < input[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        int length = 0;
        for(int i = 0; i < N; i++) {
            length = Math.max(length, dp[i]);
        }
        System.out.println(length);
    }
}