import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        String str1 = arr[0] + arr[1];
        String str2 = arr[2] + arr[3];

        Long a = Long.parseLong(str1);
        Long b = Long.parseLong(str2);
        System.out.println(a + b);
    }
}