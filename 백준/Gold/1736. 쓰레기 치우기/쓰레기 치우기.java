import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] size = br.readLine().split(" ");
        int W = Integer.parseInt(size[0]);
        int H = Integer.parseInt(size[1]);

        int[][] map = new int[W+1][H+1];
        PriorityQueue<Integer> pq[] = new PriorityQueue[H+1];
        for(int i = 1; i <= H; i++) {
            pq[i] = new PriorityQueue<Integer>();
        }
        for(int i = 1; i <= W; i++) {
            String[] cells = br.readLine().split(" ");
            for(int j = 1; j <= H; j++) {
                map[i][j] = Integer.parseInt(cells[j-1]);
                if(map[i][j] == 1) {
                    pq[j].add(i);
                }
            }
        }
        
        int answer = 0;
        for(int i = H; i >= 1; i--) {
            int pa = 0;
            int h = W;
            for(int j = H; j >= 1; j--) {
                if(pq[j].size() == 0) {
                    continue;
                }
                int s = pq[j].peek();
                if(h >= s) {
                    while(pq[j].size() > 0 && h >= pq[j].peek()) {
                        pq[j].poll();
                        pa++;
                    }
                    h=s;
                }
            }
            if(pa > 0) answer++;
            if(pa == 0) break;
        }
        System.out.println(answer);

    }
}