import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 민규가 사려하는 카드의 개수
        StringTokenizer st = new StringTokenizer(br.readLine()); // 카드 n개가 포함된 카드팩

        // 사려고 하는 개수랑 구입한 카드팩 안의 카드의 개수가 같아야 한다. (많이 사서 버리기 안됨)
        int[] dp = new int[N + 1]; // 0은 내비두고 1부터 N+1까지 채우자.
        int[] cards = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] = Math.max(dp[i], dp[i -j] + cards[j]);
            }
        }

        System.out.println(dp[N]);
    }
}
