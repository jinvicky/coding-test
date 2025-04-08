import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> pqA = new PriorityQueue<>();
        PriorityQueue<Integer> pqD = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0; i < operations.length; i++) {
            String[] split = operations[i].split(" ");
            
            String op = split[0];
            int num = Integer.parseInt(split[1]);
            
            if(op.equals("I")) {
                pqA.add(num);
                pqD.add(num);
            } else if (op.equals("D")) {
                if (num == 1) { // 최댓값 삭제
                    pqA.remove(pqD.poll());
                } else { // 최솟값 삭제
                    pqD.remove(pqA.poll());
                }
            }
                
        }
        
    
        // 큐가 비었으면 [0,0] 반환
        if(pqD.isEmpty() && pqA.isEmpty()) return new int[]{0,0};
        
        int[] answer = new int[2];
        answer[0] = pqD.poll();
        answer[1] = pqA.poll();
        
        return answer;
    }
}