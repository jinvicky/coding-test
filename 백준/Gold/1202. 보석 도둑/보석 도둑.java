import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    
    static class jewel implements Comparable<jewel> {
        int value, weight;
        
        public jewel(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }
        
        @Override
        public int compareTo(jewel o) {
            if (this.weight == o.weight) {
                return o.value - this.value;
            }
            return this.weight - o.weight;
        }
    }
    
    static int N, K;
    static long answer = 0;
    static int[] bag;
    static jewel[] jewels;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        bag = new int[K];
        jewels = new jewel[N];
        
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int M = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());
            jewels[i] = new jewel(V, M);
        }
        
        for(int i = 0; i < K; i++) {
            int C = Integer.parseInt(br.readLine());
            bag[i] = C;
        }
        
        Arrays.sort(bag);
        Arrays.sort(jewels);
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i = 0, j = 0; i < K; i++) {
            while(j < N) {
                if(bag[i] < jewels[j].weight) {
                    break;
                }
                pq.add(jewels[j++].value);
            }
            if(!pq.isEmpty()) {
                answer += pq.poll();
            }
        }
        System.out.println(answer);
        
    }

}