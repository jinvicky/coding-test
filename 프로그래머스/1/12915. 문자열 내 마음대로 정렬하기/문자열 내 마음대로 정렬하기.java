import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        
        Arrays.sort(strings);
        Arrays.sort(strings, (a,b) -> {
            
            
            // 오름차순인데 특수한 조건의 오름차순
            return a.charAt(n) - b.charAt(n);
        });
        
        
        return strings;
    }
}