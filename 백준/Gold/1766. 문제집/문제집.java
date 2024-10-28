
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * 백준 1766번 문제 - 문제집
 *
 * [오래 걸린 부분]
 * 먼저 푸는 것이 좋은 문제 외의 문제들은 뭐부터 출력해야 했는지 떠올리는 게 어려웠음.
 *
 * [결과]
 * 오답
 * 
 * [오답노트]
 * 우선순위 큐를 썼어야 했는데 map으로 풀었다.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] extent = br.readLine().split(" ");

        int n = Integer.parseInt(extent[0]);
        int k = Integer.parseInt(extent[1]);

        int[] indegree = new int[n+1];
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();

        for(int i = 0; i <= n; i++) {
            a.add(new ArrayList<>());
        }

        for(int i = 0; i < k; i++) {
            String[] line = br.readLine().split(" ");
            int pre = Integer.parseInt(line[0]);
            int post = Integer.parseInt(line[1]);

            a.get(pre).add(post);
            indegree[post]++;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 1; i <= n; i++) {
            if(indegree[i] == 0) {
                pq.offer(i);
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()) {
            int now = pq.poll();
            sb.append(now + " ");

            for(int next : a.get(now)) {
                indegree[next]--;

                if(indegree[next] == 0) {
                    pq.offer(next);
                }
            }
        }
        System.out.println(sb.toString());
    }
}
