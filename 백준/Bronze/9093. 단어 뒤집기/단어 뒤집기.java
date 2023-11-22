
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < length; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine(), " ");
            while (str.hasMoreTokens()) {
                StringBuffer sb = new StringBuffer(str.nextToken());
                result.append(sb.reverse() + " ");
            }
            result.append("\n");
        }
        System.out.println(result);
    }
}