import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        // 큐를 구현한다. 
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < progresses.length; i++) {
            int p = progresses[i];
            int s = speeds[i];
            
            int todo = 100 - p; // 해야 할 일 
            int date = todo / s + (todo % s == 0 ? 0 : 1); // 소요 시간
            
            queue.add(date);
        }
        
        // 
        int d = queue.peek(); // 큐의 첫번째 date 저장 
        int depCnt = 0;
        List<Integer> list = new ArrayList<>();
        
        while(!queue.isEmpty()) {
           
            if(d < queue.peek()) {
                list.add(depCnt);
                depCnt = 0;
                d= queue.peek();
            } else {
                depCnt++;
                queue.poll();
            }
             if(queue.peek() == null) {
                list.add(depCnt);
                break;
            }
        }
        
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}