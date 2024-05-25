import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int maxOfN = 100_000;

        // dp를 선언한다. (2차원, 3까지 가로로 저장가능한)
        long[][] dp = new long[maxOfN+ 1][4];
        // 10000009로 나눈 나머지를 구해야 하므로 공통 변수로 뺀다.
        int modular = 1000_000_009;

        // 1,2,3의 경우를 for 반복 전에 초기화한다.
        dp[1][1] = 1;
        dp[2][2] = 1;
        dp[3][1] = dp[3][2] = dp[3][3] = 1;

        // 4부터 n까지 dp에 값을 저장한다.
        // +1로 끝나는 경우, +2로 끝나는 경우, +3으로 끝나는 경우를 고려해야 한다.
        // 일단 문제의 최대 max까지 for문을 돌려서 dp를 초기화한다.
        for(int i = 4; i <= maxOfN; i++) {
            dp[i][1]= (dp[i-1][2] + dp[i-1][3]) % modular;
            dp[i][2]= (dp[i-2][1] + dp[i-2][3]) % modular;
            dp[i][3]= (dp[i-3][1] + dp[i-3][2]) % modular;
        }
        // 그 다음에 for문으로 입력값 [t][1] [t][2] [t][3]을 더해서 sb에 추가한다.
        for(int i = 0; i < n; i++) {
            int t = Integer.parseInt(br.readLine());
            sb.append((dp[t][1] + dp[t][2] + dp[t][3]) % modular).append("\n");
        }
        System.out.println(sb);
    }
}