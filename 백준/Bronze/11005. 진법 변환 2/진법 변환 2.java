
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputArray = br.readLine().split(" ");
        int N = Integer.parseInt(inputArray[0]);
        int B = Integer.parseInt(inputArray[1]);

        StringBuilder sb = new StringBuilder();

        String[] arr = new String[36];

        for(int i = 0; i < 10; i++) {
            arr[i] = String.valueOf(i);
        }

        for(int j = 10; j < 36; j++) {
            arr[j] = String.valueOf((char)('A' + j - 10));
        }

//        while(N > 0) {
//            sb.append(arr[B - 1]);
//            N /= B;
//        }

        while(N > 0) {
//            sb.append(arr[B - 1]);
//            N /= B;

            if (N % B < 10) {
                sb.append((char) (N % B + '0'));
            }
            else{
                sb.append((char) (N % B - 10 + 'A'));
            }

            N /= B;
        }

        System.out.println(sb.reverse().toString());

    }
}
