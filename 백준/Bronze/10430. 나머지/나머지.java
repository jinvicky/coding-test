import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");

        int A = Integer.parseInt(arr[0]);
        int B = Integer.parseInt(arr[1]);
        int C = Integer.parseInt(arr[2]);

        System.out.print((A + B) % C + "\n");
        System.out.print((((A % C) + (B % C)) % C) + "\n");
        System.out.print(((A * B) % C) + "\n");
        System.out.println((((A % C) * (B % C)) % C) + "\n");
    }
}