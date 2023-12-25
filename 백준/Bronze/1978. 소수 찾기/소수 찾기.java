import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");
        int count = 0;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(numbers[i]);
            if(isPrimeNumber(num)) count++;
        }

        System.out.println(count);

    }

    public static boolean isPrimeNumber(int num) {
        // 1 이하는 전부 소수 아님, 2,3은 소수이지만 2의 배수는 소수가 아님, 
        if (num <= 1) return false;    // 1은 소수가 아니다.
        if (num <= 3) return true;    // 2와3은 소수이다.
        if (num % 2 ==0) return false;
        for(int div = 3; div <= Math.sqrt(num); div+=2) {
            if(num % div == 0) {
                return false;
            }
        }
        return true;
    }
}