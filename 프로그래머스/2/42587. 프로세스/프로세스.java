import java.util.*;

class Solution {
    
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Integer> numberQ = new LinkedList<>();
        Queue<Integer> idxQ = new LinkedList<>();
        
        for(int i = 0; i < priorities.length; i++) {
            numberQ.add(priorities[i]);
            idxQ.add(i);
            pq.add(priorities[i]);
        }
        
        int[] orderArr = new int[priorities.length];
        int order = 0;
        while(!pq.isEmpty()) {
            if (numberQ.peek() != pq.peek()) { // 맞는 우선순위가 아님
                numberQ.add(numberQ.poll());
                idxQ.add(idxQ.poll());
            } else {
               
                // 맞다. 그러면 pq는 그냥 버리고 idxQ만 챙긴다. 
                orderArr[order] = idxQ.poll();
                    numberQ.poll();
                    pq.poll();
                order++;
            }
        }
        
        for(int i = 0; i < orderArr.length; i++) {
            if(orderArr[i] == location) {
                return i + 1;
            }
            
        }
        return 0;
    }
}
