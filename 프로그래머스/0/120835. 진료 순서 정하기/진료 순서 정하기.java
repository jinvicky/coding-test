import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] copy = Arrays.copyOf(emergency, emergency.length);
        Arrays.sort(copy);
        
        // map에 우선순위를 먼저 정해줄거야. 
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = copy.length - 1 ; i >=0; i--) {
            map.put(copy[i], copy.length - i);
        }
        
        
        int[] answer = new int[emergency.length];
        
        for(int i = 0; i < emergency.length; i++) {
            answer[i] = map.get(emergency[i]);
        }
        
        return answer;
    }
}