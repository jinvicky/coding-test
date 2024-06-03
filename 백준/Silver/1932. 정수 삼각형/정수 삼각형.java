import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] dp = new int[N][N];

        for(int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            for(int j = 0; j <= i; j++) {
                dp[i][j] = Integer.parseInt(str[j]);
            }
//            System.out.println(" =================== ");
        }
//        int[][] input = {
//            {0, 7, 0, 0, 0, 0},
//            {0, 3, 8, 0, 0, 0},
//            {0, 8, 1, 0, 0, 0},
//            {0, 2, 7, 4, 4, 0},
//            {0, 4, 5, 2, 6, 5}
//        };

        /**
         * int[][] dp = {
         * {7},
         * {3, 8},
         * {8, 1, 0},
         * {2, 7, 4, 4},
         * {4, 5, 2, 6, 5}
         */
        for(int i = 1; i < N; i++) {
            for(int j = 0; j <= i; j++) {
                int leftTop = (j-1) < 0 ? 0 : dp[i - 1][j - 1];
                int rightTop = dp[i - 1][j];
                int me = dp[i][j];

                //dp에 저장한다. leftTop과 rightTop중에 본인(input[i][j])을 더한 값이 더 큰 쪽을
                dp[i][j] = Math.max(leftTop + me, rightTop + me);
//                System.out.println("dp[i] = " + dp[i][j]);
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < N; i++) {
            max = Math.max(max, dp[N-1][i]);
        }
        System.out.println(max);
    }
}
