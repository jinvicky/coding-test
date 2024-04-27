import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 전체 입력줄 수
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= T; i++) {
            String[] array = br.readLine().split(" ");
            long gcdSum = 0;

            for (int j = 1; j < array.length; j++) { //0번째는 탐색에서 제외해야 함. (길이를 나타내는 걸)
                for (int k = j + 1; k < array.length; k++) {
                    if (j != k) {
                        gcdSum += gcd2(Integer.parseInt(array[j]), Integer.parseInt(array[k]));
                    }
                }
            }
            sb.append(gcdSum).append("\n");
        }
        System.out.println(sb);
    }
    public static int gcd2(int v1, int v2) {
        if (v2 == 0)  {
            return v1;
        }
        return gcd2(v2, v1 % v2);
    }
}