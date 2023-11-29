import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] params = br.readLine().split(" ");
        int N = Integer.parseInt(params[0]);

        Queue<Integer> queue = new LinkedList<>();
        int interval = Integer.parseInt(params[1]);

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        bw.append("<");

        while (queue.size() > 1) {
            for(int j = 0; j < interval -1; j++) {
                queue.add(queue.poll());
            }
            bw.append(queue.poll() +", ");
        }

        //마지막 , 없는 숫자
        bw.append(queue.poll()+">");
        bw.flush();
        bw.close();
    }
}
