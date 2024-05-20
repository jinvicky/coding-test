import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N+1];
        int[] input = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            input[i] = Integer.parseInt(st.nextToken());
            dp[i] = input[i]; // dp 배열을 사전 초기화해둔다.
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j < i; j++) {
                /**
                 * i가 1이면 아무것도 하지 않는다.
                 * i가 2라면 j는 1번만 실행한다.
                 * i가 3이면 j는 2번 실행한다.
                 * i가 4이면 j는 3번 실행한다.
                 * i가 5이면 j는 4번 실행한다. ... 생략
                 */
                if(input[j] < input[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + input[i]);
                }
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i : dp) {
            max = Math.max(i, max);
        }
        System.out.println(max);
    }
}