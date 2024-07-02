import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
//        int N = 380;
        N = 1000 - N; // 1000 - 380
        
        int[] coins = {500, 100, 50, 10, 5, 1};
        int count = 0;
        for(int coin: coins) {
            if(N/coin > 0) {
                // count에 N을 coin으로 나눈 몫을 더한다.
                count += N / coin;
                // N은 N을 coin으로 나눈 나머지를 넣는다.
                N %= coin;
            }
        }
        System.out.println(count);
    }
}