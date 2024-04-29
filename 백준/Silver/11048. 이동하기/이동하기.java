import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int height = Integer.parseInt(st.nextToken());
        int width = Integer.parseInt(st.nextToken());

        int[][] dp = new int[height + 1][width + 1];

        for (int i = 1; i <= height; i++) {
            StringTokenizer candies = new StringTokenizer(br.readLine());
            for (int j = 1; j <= width; j++) {
                int candy = Integer.parseInt(candies.nextToken());
                int fromLeft = dp[i][j - 1];
                int fromUp = dp[i - 1][j];
                int fromDiagonal = dp[i - 1][j - 1];

                dp[i][j] = Math.max(fromLeft, Math.max(fromUp, fromDiagonal)) + candy;
            }
        }
        System.out.println(dp[height][width]);
    }
}