import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = Integer.MIN_VALUE;
        StringTokenizer sub = new StringTokenizer(br.readLine(), "-");

        while (sub.hasMoreTokens()) {
            int temp = 0;

            // 뺄셈 중에서 덧셈먼저 다 + 기준으로 분리해서 저장
            StringTokenizer add = new StringTokenizer(sub.nextToken(), "+");

            // add의 값들 다 더하기
            while (add.hasMoreTokens()) {
                temp += Integer.parseInt(add.nextToken());
            }

            if (sum == Integer.MIN_VALUE) {
                sum = temp;
            } else {
                // sum에서 빼기
                sum -= temp;
            }
        }
        System.out.println(sum);
    }
}