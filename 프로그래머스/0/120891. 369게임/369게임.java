import java.util.*;

class Solution {
    public int solution(int order) {
        Set<Integer> set = Set.of(3, 6, 9);     
        int answer = 0;
        
        while(order > 0) {
            if(set.contains(order % 10)) {
                answer++;
            }
            order /= 10;
        }
        return answer;
    }
}