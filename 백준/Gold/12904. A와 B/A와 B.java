import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder S = new StringBuilder(br.readLine());
        StringBuilder T = new StringBuilder(br.readLine());

        while (S.length() < T.length()) {
            int finalChar = T.length() - 1;

            if(T.charAt(finalChar) == 'A') {
                T.deleteCharAt(finalChar);
            } else if (T.charAt(finalChar) == 'B') {
                T.deleteCharAt(finalChar);
                T.reverse();
            }
        }
        if(T.toString().equals(S.toString())) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}