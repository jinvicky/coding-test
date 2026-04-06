import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 1; i <= n; i++) {
            set.add(i);
        }
        
        for (int i = 1; i <= n; i++) {
            if(n % i == 0 && set.contains(n / i)) {
                answer++;
            }
            
        }
        
        return answer;
    }
}