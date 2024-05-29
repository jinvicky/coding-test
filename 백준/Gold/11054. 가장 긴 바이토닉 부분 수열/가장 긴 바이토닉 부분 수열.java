import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] r_dp = new int[N];
        int[] l_dp = new int[N];
        int[] input = new int[N];

        for(int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N; i++) {
            r_dp[i] = 1;
            for(int j = 0; j < i; j++) {
                if(input[j] < input[i] && r_dp[i] < r_dp[j] + 1) {
                    r_dp[i] = r_dp[j] + 1;
                }
            }
        } // 여기까지는 기존의 증가하는 수열 로직과 같다.

        for(int i = N - 1; i >= 0; i--) {
            l_dp[i] = 1; // 초기값은 1로 설정해야 한다.
            for(int j = N -1; j > i; j--) {
                if(input[i] > input[j] && l_dp[i] < l_dp[j] + 1) {
                    l_dp[i] = l_dp[j] + 1;
                }
            }
        }

        // LIS를 왼->오, 오->왼 2가지 방향에서 각각 구한 다음에 합쳐야 하는 것이었다.
        int max = 0;
        for(int i = 0; i < N; i++) {
            if (max < r_dp[i] + l_dp[i]) {
                max = r_dp[i] + l_dp[i];
            }
        }

        System.out.println(max - 1); // 최종적으로 숫자 1만 중복된다. 그냥 최후에 1번 빼면 된다.
    }
}