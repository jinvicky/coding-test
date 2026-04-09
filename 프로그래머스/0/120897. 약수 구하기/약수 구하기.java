import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                answer.add(i);
                
                if (i != n / i) {
                    answer.add(n / i);
                }
            }
        }
        
        Collections.sort(answer); // 선택 (정렬 필요하면)
        
        return answer.stream().mapToInt(a -> a).toArray();
    }
}