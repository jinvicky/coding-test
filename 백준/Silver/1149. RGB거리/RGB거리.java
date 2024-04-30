import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 칠할 집의 개수

        int[][] dp = new int [n+1][n+1]; // 각 집을 칠하는 비용을 저장할 배열

        for (int i = 1; i <= n; i++) {
            String[] input = br.readLine().split(" ");
            int red = Integer.parseInt(input[0]);
            int green = Integer.parseInt(input[1]);
            int blue = Integer.parseInt(input[2]);

            dp[i][1] = Math.min(dp[i-1][2], dp[i-1][3]) + red;
            dp[i][2] = Math.min(dp[i-1][1], dp[i-1][3]) + green;
            dp[i][3] = Math.min(dp[i-1][1], dp[i-1][2]) + blue;
        }
        int min = Math.min(dp[n][1], Math.min(dp[n][2], dp[n][3]));
        System.out.println(min);
    }
}