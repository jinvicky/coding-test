import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d); // 신청 금액을 작은 순으로 정렬한다.
        int bd = budget;
        
        for(int i = 0; i < d.length; i++) {
            int amount = d[i];
            if(bd < amount) {
                break;
            } else {
                
                bd -= amount;
                answer++;
            }
        }
        
        return answer;
    }
}