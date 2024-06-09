import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line.split(" ")[0]);
        int K = Integer.parseInt(line.split(" ")[1]);
        int[] input = new int[N];

        for(int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }
        int count = 0;

        for(int i = N - 1 ; i >= 0; i--) {
            // 일단 큰 수부터 나누어서 몫을 구한다.
            count += K / input[i];
            // 나머지를 K로 만든다.
            K %= input[i];
        }
        System.out.println(count);
    }
}