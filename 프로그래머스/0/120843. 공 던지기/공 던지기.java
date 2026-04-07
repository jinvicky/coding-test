import java.util.*;

class Solution {
    public int solution(int[] numbers, int k) {
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < numbers.length; i++) {
            queue.add(numbers[i]);
        }
        
        while(k > 1) {
            queue.add(queue.poll());
            queue.add(queue.poll());
            k--;
        }
        return queue.poll();
    }
}