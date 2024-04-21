import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        boolean[] primes = sieveOfEratosthenes(1000000); // 100만까지의 소수를 미리 구함

        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(br.readLine());
            int goldGuess = goldbachConjecture(primes, number);
            sb.append(goldGuess).append("\n");
        }
        System.out.println(sb);
    }

    static int goldbachConjecture(boolean[] primes, int number) {
        int goldGuess = 0;
        int half = number / 2;

        for (int prime = 2; prime <= half; prime++) {
            if (primes[prime] && primes[number - prime]) {
                goldGuess++;
            }
        }

        return goldGuess;
    }

    static boolean[] sieveOfEratosthenes(int n) {
        boolean[] primes = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            primes[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (primes[p]) {
                for (int i = p * p; i <= n; i += p) {
                    primes[i] = false;
                }
            }
        }

        return primes;
    }
}
