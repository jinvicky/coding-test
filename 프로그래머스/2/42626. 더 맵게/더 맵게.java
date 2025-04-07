import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int sc : scoville) {
            pq.add(sc);
        }
        
        while(pq.peek() < K) {
            if(pq.size() < 2) {
                return -1;
            }
                int a = pq.poll();
                int b = pq.poll();
                
                int merge = a + (b * 2);
                
                pq.add(merge);
                answer++;
            
        }
        return answer;
    }
}