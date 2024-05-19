import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 개수

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine()); // 배열의 가로 길이
            int[][] data = new int[2][n + 1];
            int[][] dp = new int[2][n+1];

            // 배열 초기화
            for (int k = 0; k <= 1; k++) { //항상 2줄
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 1; j <= n; j++) { // 결과적으로 dp는 dp[?][1]부터 시작
                    data[k][j] = Integer.parseInt(st.nextToken());
                }
            }
            // 빠뜨린 부분: 첫 j 줄을 초기화해야 한다.
            dp[0][1] = data[0][1];
            dp[1][1] = data[1][1];
            for(int h = 2; h <= n; h++) {
                dp[0][h] = Math.max(dp[1][h-1], dp[1][h-2]) + data[0][h];
                dp[1][h] = Math.max(dp[0][h-1], dp[0][h-2]) + data[1][h];
            }
            System.out.println(Math.max(dp[0][n], dp[1][n]));
        }
    }
}