import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] input = new int[N];

        for(int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        int[] greedy = new int[N];

        Arrays.sort(input);

        for(int i = 0; i < N; i++){
            for(int j = 0; j <= i; j++){
                int prevInput = input[j];
                greedy[i] += prevInput;
            }
        }

        int sum = 0;
        for(int i = 0; i < N; i++) {
            sum += greedy[i];
        }
        System.out.println(sum);
    }
}